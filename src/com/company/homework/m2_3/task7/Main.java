package com.company.homework.m2_3.task7;

/*Создать список фигур. Реализовать сортировку списка по возрастанию площади фигуры.(+)*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(2, 3), new Rectangle(5, 10), new Circle(100)};

        Arrays.sort(shapes);

        for (Shape s : shapes)
            System.out.println(s.getName() + ": " + s.getS());
    }
}
