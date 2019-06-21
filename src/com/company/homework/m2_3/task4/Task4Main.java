package com.company.homework.m2_3.task4;

/*Придумать свое исключение и написать соответствующий класс и использующий его код(+)*/

import java.util.Date;

public class Task4Main {
    public static void main(String[] args) {
        Man man = new Man("Man", "Surname", new Date(1989 - 1900, 05, 28), 1325481168);
        Woman woman = new Woman("Woman", "Surname", new Date(1991 - 1900, 03, 10), 1325481168);
        System.out.println("everything is OK.");

        Man man1 = new Man("Man1", "Surname", new Date(2020 - 1900, 05, 28), 1325481168);
    }
}
