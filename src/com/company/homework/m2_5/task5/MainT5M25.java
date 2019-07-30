package com.company.homework.m2_5.task5;

/*Написать программу копирования файла с выводом прогресса в % на
консоль.*/

public class MainT5M25 {
    public static void main(String[] args) {
        String src = "D:\\my_files\\java\\java oop\\video\\m2-8 (2014-12-26).webm";
        String dest = "D:\\my_files\\java\\java oop\\files for test\\forCopy\\m2-8 (2014-12-26).webm";

        Copy c = new Copy(src, dest, new Progress());
        c.start();
    }
}
