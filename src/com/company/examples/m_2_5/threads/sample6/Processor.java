package com.company.examples.m_2_5.threads.sample6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Processor extends Thread {
    private Data data;
    private String file;

    public Processor(Data data, String file) {
        this.data = data;
        this.file = file;
    }

    @Override
    public void run() {
        System.out.println("Waiting for data...");

        synchronized (data) {
            try {
                data.wait();
            } catch (InterruptedException e) {
                return;
            }
        }

        System.out.println("Got data. Processing it...");

        byte[] buf = data.getData();

        for (int i = 0; i < buf.length; i++) {
            buf[i]++;
        }

        try (RandomAccessFile f = new RandomAccessFile(file, "rw")){
            f.write(buf);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
