package com.company.homework.m2_4.task4;

/*Написать программу, которая создаст текстовый файл и запишет в него список файлов(путь, имя, дата создания)
* из заданного каталога(+)*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class MainM24T4 {
    public static void main(String[] args) {
        String src = "D:\\my_files\\java\\java oop\\files for test\\tetsCopy";
        String log = "D:\\my_files\\java\\java oop\\files for test\\tetsCopy\\log.txt";

        try {
            createLog(src, log);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static void createLog(String src, String pathToLogFile) throws IOException {
        File dir = new File(src);
        File[] files;
        if (dir.exists() && dir.isDirectory()) {
            files = dir.listFiles();

            try (FileOutputStream fos = new FileOutputStream(pathToLogFile)){
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isFile()) {
                        String filePath = files[i].getCanonicalPath();
                        String fileDateOfModified = new Date(files[i].lastModified()).toString();
                        fos.write("file ".getBytes());
                        fos.write(filePath.getBytes());
                        fos.write(" | ".getBytes());
                        fos.write(fileDateOfModified.getBytes());
                        if (i != files.length)
                            fos.write("\n".getBytes());
                    }else if (files[i].isDirectory()){
                        String filePath = files[i].getCanonicalPath();
                        String fileDateOfModified = new Date(files[i].lastModified()).toString();
                        fos.write("directory ".getBytes());
                        fos.write(filePath.getBytes());
                        fos.write(" | ".getBytes());
                        fos.write(fileDateOfModified.getBytes());
                        if (i != files.length)
                            fos.write("\n".getBytes());
                    }
                }
            }
        }
    }
}
