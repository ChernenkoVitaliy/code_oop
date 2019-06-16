package com.company.homework.m2_3.task3;

/*Написать аналог Integer.parseint(). Использовать исключения(+)*/

import com.company.homework.m2_3.task1.FormatException;

public class Main {
    public static void main(String[] args) {
        String s = "2012345";

        try {
            System.out.println(MyInteger.parseInt(s));
        } catch (FormatException e) {
            e.printStackTrace();
        }
    }
}
