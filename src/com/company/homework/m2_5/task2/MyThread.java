package com.company.homework.m2_5.task2;

/*Поток который каждые 10 сек выводит текущее время в консоль*/

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class MyThread extends Thread {

    @Override
    public void run() {
        GregorianCalendar calendar;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:MM:ss");

        while (!isInterrupted()) {
            calendar = new GregorianCalendar();
            System.out.println(sdf.format(calendar.getTime()));
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                return;
            }
        }


    }
}
