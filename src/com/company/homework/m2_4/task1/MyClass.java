package com.company.homework.m2_4.task1;

/*Модифицировать проект FindFiles так, чтобы программа искала в каталоге все файлы с расширением из списка(+)*/

import java.io.*;
import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String dir = "D:\\my_files\\java\\java oop\\files for test\\ffff";
        String[] ext = {".txt", ".java"};


        try {
            findFiles(dir, ext, list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : list)
            System.out.println(s);

    }

    private static void findFiles(String dir, String[] ext, ArrayList<String> list) throws IOException {
        File fdir = new File(dir);

        for (int i = 0; i < ext.length; i++) {
            File[] files = fdir.listFiles(new MyFileNameFilter(ext[i]));
            for (int j = 0; j < files.length; j++) {
                list.add(files[j].getCanonicalPath());
            }
        }
    }
}
