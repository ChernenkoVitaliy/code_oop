package com.company.examples.m2_7.task_manager;

public class MyStop extends Thread {
    private TaskMeneger s;

    public MyStop (TaskMeneger s) {
        this.s = s;
    }

    @Override
    public void run() {
        s.stop();
    }
}
