package com.company.examples.m2_5.threads.sample5;

public class Action extends Thread {
    private Account acc;
    private int withdraw;

    public Action(Account acc, int withdraw) {
        this.acc = acc;
        this.withdraw = withdraw;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(System.currentTimeMillis() % 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (acc) {
            int has = acc.getMoney();
            if (has >= withdraw)
                acc.setMoney(acc.getMoney() - withdraw);
        }
    }
}
