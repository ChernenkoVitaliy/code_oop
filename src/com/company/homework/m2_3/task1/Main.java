package com.company.homework.m2_3.task1;

/*Написать метод разбора списка параметров в формате URL:
* param1=value&param2=value2&param3=value3. В случае ошибки в формате брасать исключение.(+)*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UrlParser urlParser = new UrlParser();
        String url = "param1=value1&param2=value2&param3=value3";
        String url2 = "=value2&param2=value2&param3=value3";
        String url3 = "param1=value1&param2=&param3=value3";

        try {
            urlParser.parsUrl(url3);
        } catch (FormatException e) {
            e.printStackTrace();
        }

    }
}
