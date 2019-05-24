package com.company.homework.m2_1.task2;

public class Rectangle {
    public static int count;
    private int height;
    private int width;

    public Rectangle() {
        height = 5;
        width = 10;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        count++;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int square() {
        return height * width;
    }
}
