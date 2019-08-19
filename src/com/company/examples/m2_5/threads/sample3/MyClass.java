package com.company.examples.m2_5.threads.sample3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        String path = "D:\\my_files\\java\\java oop\\files for test";
        ArrayList<String> list = new ArrayList<>();

        try {
            listAll(path, list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : list)
            System.out.println(s);
    }


    private static void listAll(String path, ArrayList<String> list) throws IOException {
        File dir = new File(path);
        File[] files = dir.listFiles();

        if (files == null)
            return;

        for (File f: files) {
            if (f.isFile()){
                list.add("F: " + f.getCanonicalPath());
            }else {
                list.add("D: " + f.getCanonicalPath());
                listAll(f.getCanonicalPath(), list);
            }
        }
    }
}
