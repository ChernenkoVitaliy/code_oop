package com.company.examples.m2_8.monitor3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MonitorThread extends Thread {
    private String path;
    private int timeout;
    private HashMap<String, Long> prev = new HashMap<>();
    private HashMap<String, Long> curr = new HashMap<>();
    private IFileEvents events;

    public MonitorThread(String path) {
        this.path = path;
        createHashMap(prev);
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            createHashMap(curr);
            compareMaps(prev, curr);
            prev.clear();
            prev.putAll(curr);

            try {
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public void setEvents(IFileEvents events) {
        this.events = events;
    }

    private void doFileChanged(String path) {
        if (events != null)
            events.onFileChanged(path);
    }

    private void doFileAdded(String path) {
        if (events != null)
            events.onFileAdded(path);
    }

    private void doFileDeleted(String path) {
        if (events != null)
            events.onFileDeleted(path);
    }

    private void createHashMap(HashMap<String, Long> output) {
        try{
            File file = new File(path);
            File[] list = file.listFiles();

            output.clear();
            for (File f : list)
                output.put(f.getCanonicalPath(), f.lastModified());
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void compareMaps(HashMap<String, Long> m1, HashMap<String, Long> m2) {
        Set<String> keys = m1.keySet();
        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()) {
            String path = iterator.next();

            if (m2.containsKey(path)) {
                long date1 = m1.get(path);
                long date2 = m2.get(path);

                if (date2 != date1)
                    doFileChanged(path);
            }else {
                doFileDeleted(path);
            }
        }

        keys = m2.keySet();
        iterator = keys.iterator();
        while (iterator.hasNext()) {
            String path = iterator.next();

            if (!m1.containsKey(path))
                doFileAdded(path);
        }
    }
}
