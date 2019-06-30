package com.company.homework.m2_3.task9;

import java.io.File;

public class Monitor {
    private String[] paths;
    private IFileEvent event;

    public Monitor(String[] paths, IFileEvent event) {
        this.paths = paths.clone();
        this.event = event;
    }

    public void start() {
        //если длинна массива с путями больше нуля, создаем массив с файлами.
        int count = 0;
        if (paths.length > 0) {
            File[] files = new File[paths.length];
            for (int i = 0; i < paths.length; i++) {
                files[i] = new File(paths[i]);
            }


            while (true) {
                for (int i = 0; i < paths.length; i++) {
                    int currentCount = 0;
                    if (files[i].exists() && files[i].isFile()) {
                        currentCount++;
                        if (currentCount == 3) {
                            event.onAllFilesAdded(paths);
                            return;
                        }
//                        event.onFileAdded(files[i].getPath());
                    }
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
}
