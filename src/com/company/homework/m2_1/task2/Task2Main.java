package com.company.homework.m2_1.task2;

public class Task2Main {
    public static void main(String[] args) {
        System.out.println("Amount of Rectangles before creation: " + Rectangle.count);
        for (int i = 10; i > 0; i--) {
            System.out.println(new Rectangle(i, i + 1).square());
        }

        System.out.println("Amount of rectangles after creation: " + Rectangle.count);
    }
}
