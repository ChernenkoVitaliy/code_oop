package com.company.homework.m2_7.task4;

/*написать функцию, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран(+)*/

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainT4M27 {
    public static void main(String[] args) {
        String path = "D:\\my_files\\java\\java oop\\files for test";
        List<String> list = new ArrayList<>();

        savePaths(path, list);

    }

    private static void savePaths(String path, List<String> list) {
        File file = new File(path);
        File[] files = file.listFiles();

        for (File f : files) {
            try {
                list.add(f.getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (list.size() >= 5) {
            for (int i = 0; i < 5; i ++)
                System.out.println(list.get(i));
        }else {
            for (String s : list)
                System.out.println(s);
        }

    }
}
