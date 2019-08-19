package com.company.examples.m2_7.task_manager;

public class MyTask2 implements Task {
    @Override
    public void execute() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {}

            System.out.println("MyTask2");
    }
}
