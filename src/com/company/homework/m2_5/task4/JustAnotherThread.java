package com.company.homework.m2_5.task4;

public class JustAnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(getId());
        while (!isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Child thread Interrupted!!!!!!!");
                return;
            }
        }
    }
}
