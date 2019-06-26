package com.company.examples.m2_3.interfaces.sample2_monitor;

import java.io.File;

public class Monitor {
    private String path;
    private IFileEvent event;


    public Monitor(String path, IFileEvent event) {
        this.path = path;
        this.event = event;
    }

    public void start() {
        while (true) {
            File file = new File(path);

            if (file.exists() && file.isFile()) {
                if (event != null)
                    event.onFileAdde(path);

                break;
            }


            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) { }

            System.out.println("Waiting...");
        }
    }

}
