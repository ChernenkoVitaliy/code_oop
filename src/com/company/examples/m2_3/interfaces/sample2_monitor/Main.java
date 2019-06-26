package com.company.examples.m2_3.interfaces.sample2_monitor;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("D:\\my_files\\java\\java oop\\files for test\\for monitor m2_3\\1.txt", new FileEvent());
        monitor.start();
    }
}
