package com.company.homework.m2_4.task6;

/*Написать программу, которая скопирует несколько файлов в один.
* Подумать как для этого использовать java.io.SequenceInputStream(+)*/


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class MainM24T6 {
    public static void main(String[] args) {
        String file1 = "D:\\my_files\\java\\java oop\\files for test\\tetsCopy\\1.txt";
        String file2 = "D:\\my_files\\java\\java oop\\files for test\\tetsCopy\\2.txt";
        String fileRes = "D:\\my_files\\java\\java oop\\files for test\\tetsCopy\\1and2.txt";

        try {
            combineFiles(file1, file2, fileRes);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void combineFiles(String file1, String file2, String fileRes) throws IOException {
        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2);
             SequenceInputStream sis = new SequenceInputStream(fis1, fis2)){

            try (FileOutputStream fos = new FileOutputStream(fileRes)){
                byte[] buff = new byte[1024];
                int r;

                do {
                    r = sis.read(buff, 0, buff.length);
                    if (r > 0)
                        fos.write(buff, 0, r);
                }while (r > 0);

            }
        }
    }
}
