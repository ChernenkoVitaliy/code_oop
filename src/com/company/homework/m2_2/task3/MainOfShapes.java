package com.company.homework.m2_2.task3;

/*Написать иерархию классов "Фигуры". Фигура => Треугольник => Прямоугольник => Круг. Реализовать функцию подсчета
* площади для каждого типа фигуры.(+)*/

public class MainOfShapes {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 5, 10);
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(10);

        System.out.println(Triangle.NAME + " S = " + triangle.square());
        System.out.println(Rectangle.NAME + " S = " + rectangle.square());
        System.out.println(Circle.NAME + " S = " + circle.square());
    }
}
