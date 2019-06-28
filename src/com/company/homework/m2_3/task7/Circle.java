package com.company.homework.m2_3.task7;

public class Circle extends Shape implements Colored{
    private double radius;

    public Circle(double radius) {
        name = "Circle";
        this.radius = radius;
    }

    @Override
    public double getS() {
        s = Math.PI * radius * radius;
        return s;
    }

    @Override
    public int getColor() {
        return RED;
    }
}
