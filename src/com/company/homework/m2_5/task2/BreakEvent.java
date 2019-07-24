package com.company.homework.m2_5.task2;

/*просто класс который выводит в консоль сообщение о том что поток прервали*/

public class BreakEvent implements IBreakEvent {
    @Override
    public void breaked() {
        System.out.println("Thread is interapted!!!");
    }
}
