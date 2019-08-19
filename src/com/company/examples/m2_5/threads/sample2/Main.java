package com.company.examples.m2_5.threads.sample2;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Task task = new Task(new BigInteger("5"), new Finish());
        task.start();
        try {
            task.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
    }
}
