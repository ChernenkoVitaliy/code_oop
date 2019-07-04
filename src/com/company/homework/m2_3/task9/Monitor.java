package com.company.homework.m2_3.task9;

import java.io.File;
import java.util.Arrays;

public class Monitor {
    private String[] paths;
    private IFileEvent event;

    public Monitor(String[] paths, IFileEvent event) {
        this.paths = Arrays.copyOf(paths, paths.length);
        this.event = event;
    }

    public void start() {
        File file;
        int n = 0;

        while (true) {
            for (int i = 0; i < paths.length; i++) {
                if (paths[i] != null) {
                    file = new File(paths[i]);

                    if (file.exists() && file.isFile()) {
                        paths[i] = null;
                        n++;
                    }
                }
            }

            if (n == paths.length) {
                event.onFilesAdded();
                break;
            }


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
