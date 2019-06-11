package com.company.homework.m2_2.task6;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        name = "Circle";
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double square() {
        return Math.PI * (radius * radius);
    }
}
