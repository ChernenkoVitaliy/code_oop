package com.company.homework.m2_1.task1;

/*Написать класс Circle по анологиии Rectangle и метод, который будет возвращать его площадь.*/

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double square() {
        return Math.PI * (radius * radius);
    }
}
