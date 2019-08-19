package com.company.examples.m2_7.task_manager;

public class MainOfTaskManager {
    public static void main(String[] args) throws InterruptedException {
        TaskMeneger m = new TaskMeneger();

        m.setAsync(true);
        m.add(new MyTask2());
        m.add(new MyTask1());

        m.start();

        Thread.sleep(15000);

        m.stop();

    }
}
