package com.company.homework.m2_5.task6;

/*Изменить решение задачи про банк так, чтобы баланс никогда не становился меньше 100 y.e*/

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1000);

        for (int i = 0; i < 100; i++) {
            Action act = new Action(acc, 10);
            act.start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(acc.getMoney());
    }
}
