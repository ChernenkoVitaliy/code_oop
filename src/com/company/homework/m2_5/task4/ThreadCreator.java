package com.company.homework.m2_5.task4;

import java.util.ArrayList;

public class ThreadCreator extends Thread {
    private ArrayList<JustAnotherThread> list = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            JustAnotherThread jat = new JustAnotherThread();
            jat.start();
            list.add(jat);
        }

        while (!isInterrupted()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }

        for (JustAnotherThread j : list) {
            j.interrupt();
            try {
                j.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("ThreadCreator interrupted!");
    }
}
