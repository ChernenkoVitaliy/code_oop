package com.company.homework.m2_5.task3;

/*Сщздать 100 потоков, каждый из которых выведет на экран свой номер и дождется, пока его прервут.*/

public class MainT3M25 {
    public static void main(String[] args) {
        JustThread thread;
        for (int i = 0; i < 100; i++) {
            thread = new JustThread();
            thread.start();
            thread.interrupt();
        }
    }
}
