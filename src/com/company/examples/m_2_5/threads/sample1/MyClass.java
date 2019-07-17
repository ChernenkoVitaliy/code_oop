package com.company.examples.m_2_5.threads.sample1;

public class MyClass {
    public static void main(String[] args) {
        try {
            Counter c = new Counter();
            c.start();
            c.join();

            System.out.println("Thread finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class Counter extends Thread {
        @Override
        public void run() {
            int x = 1;

            while (x < 1000)
                System.out.println(x++);
        }
    }
}
