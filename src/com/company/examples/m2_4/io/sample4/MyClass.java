package com.company.examples.m2_4.io.sample4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyClass {
    public static void main(String[] args) {
        String src = "D:\\my_files\\java\\java oop\\files for test\\tetsCopy\\1.txt";
        String dest = "D:\\my_files\\java\\java oop\\files for test\\tetsCopy\\1copy.txt";

        try {
            copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void copyFile(String src, String dest) throws IOException {
        FileInputStream in = new FileInputStream(src);
        try{
            FileOutputStream out = new FileOutputStream(dest);
            try {
                byte[] buf = new byte[1024]; //1 KB
                int r;

                do {
                    r = in.read(buf, 0, buf.length);
                    if (r > 0)
                        out.write(buf, 0, r);
                }while (r > 0);

            }finally {
                out.close();
            }
        }finally {
            in.close();
        }
    }
}
