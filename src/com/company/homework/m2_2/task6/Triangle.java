package com.company.homework.m2_2.task6;

public class Triangle extends Shape{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        name = "Triangle";
    }

    @Override
    public double square() {
        return (a * b) / 2;
    }
}
