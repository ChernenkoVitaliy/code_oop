package com.company.homework.m2_3.task8;

/*Добавить в проект "монитор" функцию вывода даты создания файла на экран(+)*/

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\unknown\\Desktop\\Java ООП\\otherFiles\\11.txt";
        Monitor monitor = new Monitor(path, new FileEvent());

        monitor.start();
    }
}
