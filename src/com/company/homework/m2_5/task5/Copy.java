package com.company.homework.m2_5.task5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Copy extends Thread{
    private static final int BLOCK_SIZE = 1024;

    private String src;
    private String dest;
    private IProgress progress;
    private long counter;

    public Copy(String src, String dest, IProgress progress) {
        this.src = src;
        this.dest = dest;
        this.progress = progress;
    }

    @Override
    public void run() {
        try {
            copyFile();
        } catch (IOException e) {
            return;
        }
    }

    private void copyFile() throws IOException {
        try(RandomAccessFile in = new RandomAccessFile(src, "r");
        RandomAccessFile out = new RandomAccessFile(dest, "rw")){
            final double onePrecent = in.length() / 100;
            counter = 0;

            byte[] buf = new byte[BLOCK_SIZE];
            int r;

            do {
                r = in.read(buf, 0, buf.length);

                if (r > 0) {
                    out.write(buf, 0, r);
                    counter += r;

                    if (progress != null)
                        progress.update(counter / onePrecent);
                }
            }while (r > 0);
        }
    }
}
