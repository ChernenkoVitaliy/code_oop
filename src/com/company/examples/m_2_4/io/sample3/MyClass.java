package com.company.examples.m_2_4.io.sample3;

import java.io.*;
import java.util.Arrays;

public class MyClass {
    public static void main(String[] args)  throws IOException{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);

        try {
            dos.writeInt(777);
            dos.writeUTF("Hello!");
        }finally {
            dos.close();
        }

        byte[] arr = bos.toByteArray();
        System.out.println(Arrays.toString(arr));

        ByteArrayInputStream bis = new ByteArrayInputStream(arr);
        DataInputStream dis = new DataInputStream(bis);

        try {
            int x = dis.readInt();
            String s = dis.readUTF();

            System.out.println(x);
            System.out.println(s);
        }finally {
            dis.close();
        }
    }
}
