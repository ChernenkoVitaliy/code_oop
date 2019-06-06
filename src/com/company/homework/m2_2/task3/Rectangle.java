package com.company.homework.m2_2.task3;

public class Rectangle extends Shape{
    public static final String NAME = "Rectangle";
    private int height;
    private int widht;

    public Rectangle(int height, int widht) {
        this.height = height;
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    @Override
    public double square() {
        return height * widht;
    }
}
