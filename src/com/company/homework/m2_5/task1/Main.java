package com.company.homework.m2_5.task1;

/*Модифицировать класс Counter так, чтобы он циклически выводил числа из определенного диапазона*/

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();

        c.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        c.interrupt();
    }
}
