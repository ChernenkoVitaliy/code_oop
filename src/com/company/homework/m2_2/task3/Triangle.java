package com.company.homework.m2_2.task3;

/*Триугольник прямоугольный и площадь считается соответственно*/

public class Triangle extends Shape{
    public static final String NAME = "Triangle";
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double square() {
        return (a * b) / 2;
    }
}
