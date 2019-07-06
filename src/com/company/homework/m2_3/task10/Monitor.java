package com.company.homework.m2_3.task10;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Monitor {
    String dir;
    String ext;
    private IFileEvent event;

    public Monitor(String dir, String ext, IFileEvent event) {
        this.dir = dir;
        this.ext = ext;
        this.event = event;
    }


    //алгоритм такой: если в каталог добавился текстовый файл, программа выводит путь к нему на консоль и прекращает работу
    public void start() throws IOException {
        File file = new File(dir);

        while (true) {
            if (file.exists()) {
                File[] files = file.listFiles((dir, name) -> name.endsWith(ext));

                if (files.length > 0) {
                    for (File f : files)
                        event.fileAdded(f.getCanonicalPath());

                    break;
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Waiting for txt file...");
        }
    }
}
