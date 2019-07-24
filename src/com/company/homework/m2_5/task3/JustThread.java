package com.company.homework.m2_5.task3;

public class JustThread extends Thread {
    @Override
    public void run() {
        System.out.println(getId());
        while (!isInterrupted()) {}
    }
}
