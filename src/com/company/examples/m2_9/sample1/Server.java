package com.company.examples.m2_9.sample1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private int port;
    private Thread thread;

    public Server(int port) {
        this.port = port;
    }

    public void stop() {
        thread.interrupt();
    }

    public void start() {
        thread = new Thread() {
            @Override
            public void run() {
                try {
                    ServerSocket socket = new ServerSocket(port);

                    while (!isInterrupted()) {
                        Socket client = socket.accept();

                        try{
                            String msg = "Hello!!!\r\n";
                            client.getOutputStream().write(msg.getBytes());
                        }finally {
                            client.close();
                        }
                    }

                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
