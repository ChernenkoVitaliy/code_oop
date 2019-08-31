package com.company.homework.m2_9.task3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    private int port;
    private Thread thread;

    public MyServer(int port) {
        this.port = port;
    }

    public void stop() {
        thread.interrupt();
    }

    public void start() {
        StringBuilder sb = new StringBuilder();
        Runtime runtime = Runtime.getRuntime();
        sb.append("OS: ").append(System.getProperty("os.name")).append("\r\n")
                .append("OS version: ")
                .append(System.getProperty("os.version")).append("\r\n")
                .append("Java version: ")
                .append(System.getProperty("java.version")).append("\r\n")
                .append("Available Processors: ")
                .append(runtime.availableProcessors());


       thread = new Thread() {
           @Override
           public void run() {
               try(ServerSocket serverSocket = new ServerSocket(port)) {
                   while (!isInterrupted()) {
                       try(Socket client = serverSocket.accept()) {

                           client.getOutputStream().write(sb.toString().getBytes());

                       }
                   }
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       };

       thread.start();
        System.out.println("Server is started.");
    }
}
