package com.company.homework.m2_5.task1;

public class Counter extends Thread {
    @Override
    public void run() {
        while (!isInterrupted()) {
            for (int i = 10; i < 20; i++)
                System.out.println(i + " from thread number " + getId());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println();
        }
    }
}
