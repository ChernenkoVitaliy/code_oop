package com.company.examples.m2_3.exceptions.sample1;

public class MainOfRectangleException {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        try {
            rectangle.setHeight(10);
            rectangle.setWidth(-5);
        } catch (HeightException | WidthException e) {
            System.out.println(e.getMessage());
        }


        try {
            rectangle.setHeight(-10);
            rectangle.setWidth(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
