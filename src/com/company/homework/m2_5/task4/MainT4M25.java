package com.company.homework.m2_5.task4;

/*Создать поток, который создаст 50 потоков, каждый из которых выведет на экран свой номер и дождется, пока его прервут.
* Прерывание дочерних потоков должно выполнятся из потока их порождающего.*/

public class MainT4M25 {
    public static void main(String[] args) throws InterruptedException {
        ThreadCreator threadCreator = new ThreadCreator();
        threadCreator.start();

        Thread.sleep(5000);
        threadCreator.interrupt();
    }
}
