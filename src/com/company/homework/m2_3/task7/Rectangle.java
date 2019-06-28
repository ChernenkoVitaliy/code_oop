package com.company.homework.m2_3.task7;

public class Rectangle extends Shape implements Colored {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        name = "Rectangle";
        this.a = a;
        this.b = b;
    }


    @Override
    public int getColor() {
        return BLUE;
    }

    @Override
    public double getS() {
        s = a * b;
        return s;
    }
}
