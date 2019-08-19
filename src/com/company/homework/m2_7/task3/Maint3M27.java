package com.company.homework.m2_7.task3;

/*Написать класс который умеет хранить в себе массив любых типов данных(int, long, etc).
* Реализовать метод, который возвращает любой элемент массива по индексу.(Generics)(+)*/

import java.io.Console;

public class Maint3M27 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};
        Long[] arr1 = {10L, 20L, 30L};
        Container<Integer> container = new Container<>();
        Container<Long> container1 = new Container<>();
        System.out.println(container.getForIndex(arr, 0));
        System.out.println(container1.getForIndex(arr1, 0));
    }
}
