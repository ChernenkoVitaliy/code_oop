package com.company.examples.m_2_4.threads.sample1;

public class MyClassS1 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.start();

        try {
            Thread.sleep(5000);
            counter.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class Counter extends Thread {
        @Override
        public void run() {
            int x = 1;
             while (!isInterrupted()) {
                 System.out.println(getId() + ": " + x++);

                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     return;
                 }
             }
            System.out.println("Outside from while");
        }
    }
}
