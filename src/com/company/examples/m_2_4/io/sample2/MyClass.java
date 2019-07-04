package com.company.examples.m_2_4.io.sample2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MyClass {

    private static void findFiles(String srcPath, String ext, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles(new MyFileFilter(ext));

        for (int i = 0; i < files.length; i++) {
            list.add(files[i].getCanonicalPath());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String pathForDir = "D:\\my_files\\java\\java oop\\files for test\\for monitor m2_3";


        try {
            findFiles(pathForDir, ".txt", list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : list)
            System.out.println(s);
    }
}
