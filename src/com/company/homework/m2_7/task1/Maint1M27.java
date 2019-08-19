package com.company.homework.m2_7.task1;

/*Написать метод для конвертации массива строк/чисел в список(+)*/

import java.util.ArrayList;
import java.util.List;

public class Maint1M27 {
    public static void main(String[] args) {
        String[] arr = {"123", "abc", "hello"};


        List<String> list = arrayConverter(arr);


        for (String s : list)
            System.out.println(s);
    }

    private static List<String> arrayConverter(String[] arr) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
