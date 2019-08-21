package com.company.examples.m2_8.monitor3;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\my_files\\java\\java oop\\files for test";
        Monitor monitor = new Monitor(path);
        monitor.setTimeout(2000);
        monitor.setEvents(new MyEvents());
        monitor.start();
    }
}
