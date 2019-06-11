package com.company.homework.m2_2.task6;

/*Построить иерархию классов "Фигуры" с учетом знаний о полиморфизме. У каждого классафигуры должен быть метод подсчета
* площади. Создать список фигур. Вывести площади всех фигур на экран(+)*/

public class MainOfShapes {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(10),
                new Triangle(1, 2, 3),
                new Triangle(2, 3, 4),
                new Circle(55)
        };


        for (Shape shape : shapes){
            StringBuilder sb;

            sb = new StringBuilder()
                    .append(shape.getName())
                    .append(". Square = ")
                    .append(shape.square());
            System.out.println(sb.toString());
        }
    }
}
