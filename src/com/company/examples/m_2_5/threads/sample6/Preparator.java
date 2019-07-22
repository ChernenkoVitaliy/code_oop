package com.company.examples.m_2_5.threads.sample6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Preparator extends Thread {
    private Data data;
    private String file;

    public Preparator(Data data, String file) {
        this.data = data;
        this.file = file;
    }

    @Override
    public void run() {
        byte[] buf;

        System.out.println("Data is being prepared...");

        try(RandomAccessFile fs = new RandomAccessFile(file, "r")) {
            buf = new byte[(int) fs.length()];
            fs.read(buf);
        } catch (IOException e) {
            buf = null;
        }

        synchronized (data) {
            data.setData(buf);
            data.notifyAll();
        }
    }
}
