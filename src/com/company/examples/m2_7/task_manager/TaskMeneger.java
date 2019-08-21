package com.company.examples.m2_7.task_manager;


import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class TaskMeneger {
    private Queue<Task> queue = new ConcurrentLinkedDeque<>();
    private int limit = 10;
    private boolean async = true;
    private Thread thread;

    public boolean add(Task task) {
        if (queue.size() + 1 > limit)
            return false;

        queue.add(task);
        return true;
    }

    public boolean isAsync() {
        return async;
    }

    public void setAsync(boolean async) {
        this.async = async;
    }

    public void start() {
        thread = new TaskThread();
        thread.start();
    }

    public void stop() {
        System.out.println("Done");
        thread.interrupt();
    }

    private class TaskThread extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                final Task task = queue.poll();

                if (task != null) {
                    if (!async) {
                        task.execute();
                    }else {
                        Thread r = new Thread() {
                            @Override
                            public void run() {
                                task.execute();
                            }
                        };
                        r.start();
                    }
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}


