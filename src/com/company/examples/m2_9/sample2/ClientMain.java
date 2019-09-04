package com.company.examples.m2_9.sample2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        try {
            final Scanner scanner = new Scanner(System.in);
            final Socket socket = new Socket("127.0.0.1", 5000);
            final InputStream is = socket.getInputStream();
            final OutputStream os = socket.getOutputStream();

            System.out.println("Enter login:");
            final String login = scanner.nextLine();

            Thread th = new Thread() {
                @Override
                public void run() {
                    try{
                        while (!isInterrupted()) {
                            Message msg = Message.readFromStream(is);
                            if (msg == null)
                                Thread.yield();
                            else
                                System.out.println(msg);
                        }
                    }catch (IOException | ClassNotFoundException e) {
                        return;
                    }
                }
            };
            th.setDaemon(true);
            th.start();


            try {
                while (true) {
                    String s = scanner.nextLine();
                    if (s.isEmpty())
                        break;

                    int del = s.indexOf(':');
                    String to = "";
                    String text = s;

                    if (del > 0) {
                        to = s.substring(0, del);
                        text = s.substring(del + 1);
                    }

                    Message m = new Message();
                    m.setText(text);
                    m.setFrom(login);
                    m.setTo(to);

                    m.writeToStream(os);
                }
            }finally {
                th.interrupt();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
