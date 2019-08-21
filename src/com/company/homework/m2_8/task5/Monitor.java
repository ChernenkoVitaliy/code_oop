package com.company.homework.m2_8.task5;

public class Monitor {
    private String path;
    private MonitorThread thread;
    private IFileEvents events;
    private int timeout;

    public Monitor(String path) {
        this.path = path;
    }

    public void start() {
        thread = new MonitorThread(path);
        thread.setTimeout(timeout);
        thread.setEvents(events);
        thread.start();
    }

    public void stop() {
        thread.interrupt();
    }

    public void setEvents(IFileEvents events) {
        this.events = events;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
