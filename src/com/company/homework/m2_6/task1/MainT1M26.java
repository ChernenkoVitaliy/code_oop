package com.company.homework.m2_6.task1;

/*Написать класс "человек". Рефлизовать его методы clone, equals, hashCode, toString.*/

import java.util.Date;

public class MainT1M26 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h = new Human("John", "Smith", new Date(1989 - 1900, 05, 30), Gender.MALE);
        Human h1 = new Human("John1", "Smith1", new Date(1989 - 1900, 05, 30), Gender.MALE);
        Human h3 = (Human) h1.clone();
        System.out.println("toString(): " + h);
        System.out.println("hashCode(): " + h.hashCode());
        System.out.println("equals(): " + h1.equals(h3));
    }
}
