package com.company.homework.m2_4.task5;

/*Разобраться с java.io.BufferedInputStream и java.io.BufferedOutputStream.
* Подумать как улучшить прграмму №3 с помощью этих класов(+)*/

import java.io.*;

public class MainM24T5 {
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
                         FileOutputStream out = new FileOutputStream(dest + files[i].getName());
                         BufferedInputStream buffis = new BufferedInputStream(fis);
                         BufferedOutputStream buffout = new BufferedOutputStream(out)){
                        byte[] buf = new byte[1024];
                        int r;

                        do {
                            r = buffis.read(buf, 0, buf.length);
                            if (r > 0)
                                buffout.write(buf, 0, r);
                        }while (r > 0);
                    }
                }
            }
        }


    }
}
