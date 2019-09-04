package com.company.examples.m2_9.sample2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {
    private int port;
    private Thread thread;

    private List<Message> msg = Collections.synchronizedList(new ArrayList<>());

    public Server(int port) {
        this.port = port;
    }

    public void start() {
        thread = new Thread() {
            @Override
            public void run() {
                try {
                    ServerSocket s = new ServerSocket(port);

                    while (!isInterrupted()) {
                        Socket client = s.accept();

                        ClientThread ct = new ClientThread(client, msg);
                        ct.start();
                    }

                    s.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
    }

    public void stop() {
        thread.interrupt();
    }
}
