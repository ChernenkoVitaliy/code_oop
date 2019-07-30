package com.company.homework.m2_5.task6;

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
            if (has >= withdraw) {
                if ((acc.getMoney() - withdraw) >= 100) {
                    acc.setMoney(acc.getMoney() - withdraw);
                    System.out.println("Transaction is success");
                }else {
                    System.out.println("Balance less 100 y.e. You can't get more money!");
                    return;
                }
            }
        }
    }
}
