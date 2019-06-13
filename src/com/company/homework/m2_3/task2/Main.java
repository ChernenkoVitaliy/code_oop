package com.company.homework.m2_3.task2;

/*Найти в стандартной библиотеке 5 классов, мотоды которых, бросают исключения и написать пример кода для их обработки
* (пример: Integer.parseInt()).(+)*/

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //первай класс Integer, в задани написано "методы", для разнообразия, в этом примере и конструктор бросает исключение
        //если ему передать неправильную строку
        try {
            new Integer("100"); //для теста к значению добавить любую букву
            int i = Integer.parseInt("100"); //для теста к значению добавить любую букву
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }

        //пример 2. Класс File
        File file = new File("d://test.txt"); //заменить путь на с://test.txt
        try {
            file.createNewFile(); // если доступ к С запрещен, бросает exception
        } catch (IOException e) {
            e.printStackTrace();
        }

        //пример 3 просто exception. при вызове метода для null
        Object o = null;
        try{
//            o.hashCode(); //если раскоментировать будет exception
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }

        //пример 4
        Random random = new Random();
        byte[] b = new byte[10]; //заменить new byte[] на null
        try {
            random.nextBytes(b); //если массив null, метод бросает исключение
        }catch (NullPointerException e) {
            e.printStackTrace();
        }


        //пример 5 Robot нажимает на правую кнопку мыши
        try {
            Robot robot = new Robot();
            robot.mouseMove(800, 700);
            robot.mousePress(InputEvent.BUTTON3_MASK); //если задать неправильную маску, буде exception
            robot.mouseRelease(InputEvent.BUTTON3_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
