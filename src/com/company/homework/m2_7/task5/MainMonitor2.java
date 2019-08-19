package com.company.homework.m2_7.task5;

/*Модифицировать монитор так, чтобы он работал на базе связных списков(+)*/

public class MainMonitor2 {
    public static void main(String[] args) {
        String path = "D:\\my_files\\java\\java oop\\files for test";
        Monitor m = new Monitor(path);
        m.setTimeout(2000);
        m.setEvents(new MyEvents());
        m.start();
    }
}
