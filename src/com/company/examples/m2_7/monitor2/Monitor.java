package com.company.examples.m2_7.monitor2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Monitor {
    private String path;
    private int timeout;
    private ArrayList<String> prev = new ArrayList<>();
    private ArrayList<String> curr = new ArrayList<>();
    private IFileEvents events;

    public Monitor(String path) {
        this.path = path;
        createArray(prev);
    }

    public void start() {
        while (true) {
            createArray(curr);
            compareArrays(prev, curr);
            prev.clear();
            prev.addAll(curr);

            System.out.println("Waiting...");
            try {
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void doFileAdded(String path) {
        if (events != null)
            events.onFileAdded(path);
    }

    private void doFileDeleted(String path) {
        if (events != null)
            events.onFileDeleted(path);
    }

    private void compareArrays(ArrayList<String> m1, ArrayList<String> m2) {
        Iterator<String> it = m1.iterator();
        String path;

        while (it.hasNext()) {
            path = it.next();

            if(!m2.contains(path))
                doFileDeleted(path);
        }

        it = m2.iterator();
        while (it.hasNext()) {
            path = it.next();

            if (!m1.contains(path))
                doFileAdded(path);
        }
    }

    private void createArray(ArrayList<String> output) {
        try {
            File file = new File(path);
            File[] list = file.listFiles();

            output.clear();
            for (File f : list)
                output.add(f.getCanonicalPath());
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getPath() {
        return path;
    }

    public void setEvents(IFileEvents events) {
        this.events = events;
    }
}
