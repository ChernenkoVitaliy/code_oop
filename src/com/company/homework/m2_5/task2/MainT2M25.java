package com.company.homework.m2_5.task2;

/*Создать поток, который будет каждые 10секунд выводить текущее время на экран. Сделать возможность прерывания
* потока с помощью команды с консоли.*/

public class MainT2M25 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Breaker breaker = new Breaker(thread, new BreakEvent());

        thread.start();
        breaker.start();
    }
}
