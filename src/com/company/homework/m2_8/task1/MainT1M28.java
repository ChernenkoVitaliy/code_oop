package com.company.homework.m2_8.task1;

/*Написать программу переводчик, которая будет переводить текст, написаный на одном языке, на другой язык согласно
заранее составленному словарю(+).*/

import java.util.HashMap;
import java.util.Map;

public class MainT1M28 {
    public static void main(String[] args) {
        String sentence = "hello world I'm a Java programm";
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("hello", "привет");
        dictionary.put("world", "мир");

        String[] arr = sentence.split(" ");

        StringBuilder sb = new StringBuilder();
        if (arr.length != 0) {
            for (String s : arr) {
                if (dictionary.containsKey(s)) {
                    sb.append(dictionary.get(s)).append(" ");
                }else {
                    sb.append(s).append(" ");
                }
            }
        }

        System.out.println(sb.toString().trim());

    }
}
