package com.company.examples.m2_3.interfaces.sample1;

public class Rectangle extends Shape implements Colored {
    private int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public int getColor() {
        return RED;
    }

    @Override
    public double getS() {
        return height * width;
    }
}
