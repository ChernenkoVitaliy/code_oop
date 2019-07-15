package com.company.homework.m2_4.task3;

/*Написать программу для копирования всех файлов из одного каталога в другой(+)*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainM24T3 {
    public static void main(String[] args) {
        String src = "D:\\my_files\\java\\java oop\\files for test\\tetsCopy";
        String dest = "D:\\my_files\\java\\java oop\\files for test\\testCopy1\\";

        try {
            copyFiles(src, dest);
            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void copyFiles(String src, String dest) throws IOException {
        File dir = new File(src);
        File[] files = dir.listFiles();

        if (files.length > 0) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].exists() && files[i].isFile()){
                    try (FileInputStream fis = new FileInputStream(files[i]);
                            FileOutputStream out = new FileOutputStream(dest + files[i].getName())){
                        byte[] buf = new byte[1024];
                        int r;

                        do {
                            r = fis.read(buf, 0, buf.length);
                            if (r > 0)
                                out.write(buf, 0, r);
                        }while (r > 0);
                    }
                }
            }
        }


    }
}
