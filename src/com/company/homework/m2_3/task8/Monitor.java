package com.company.homework.m2_3.task8;

import java.io.File;

public class Monitor {
    String path;
    IFileEvent event;

    public Monitor(String path, IFileEvent event) {
        this.path = path;
        this.event = event;
    }

    public void start() {
        while (true) {
            File file = new File(path);

            if (file.exists() && file.isFile()) {
                if (event != null)
                    event.onFileAdded(path);

                break;
            }


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Waiting...");
        }
    }
}
