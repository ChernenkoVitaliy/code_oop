package com.company.examples.m2_7.monitor2;

public class MainMonitor2 {
    public static void main(String[] args) {
        String path = "D:\\my_files\\java\\java oop\\files for test";
        Monitor m = new Monitor(path);
        m.setTimeout(2000);
        m.setEvents(new MyEvents());
        m.start();
    }
}
