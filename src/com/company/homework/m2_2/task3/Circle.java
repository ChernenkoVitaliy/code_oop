package com.company.homework.m2_2.task3;

public class Circle extends Shape {
    public static final String NAME = "Circle";
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * (radius * radius);
    }
}
