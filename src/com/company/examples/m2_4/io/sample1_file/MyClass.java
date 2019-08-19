package com.company.examples.m2_4.io.sample1_file;

import java.io.File;

public class MyClass {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\my_files\\java\\java oop\\files for test\\for monitor m2_3");
            String[] list1 = file.list();
            File[] list2 = file.listFiles();

            for (String s : list1)
                System.out.println(s);

            for (File f : list2) {
                System.out.println(f.getCanonicalPath());
            }


            list2[0].delete();//удалить файл

            long sz = list2[1].length(); //размер файла
            long date = file.lastModified();
            boolean b = file.isDirectory();
            new File("D:\\my_files\\java\\java oop\\files for test\\for monitor m2_3\\11").mkdir();
            new File("D:\\my_files\\java\\java oop\\files for test\\for monitor m2_3\\1\\2\\3\\4").mkdirs();


        }catch (Exception e) {}
    }
}
