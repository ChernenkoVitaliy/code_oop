package com.company.homework.m2_3.task3;

import com.company.homework.m2_3.task1.FormatException;

public class MyInteger {

    void parseInt(String s) throws FormatException {

        if(s == null || s.length() == 0)
            throw new FormatException("value can't be NULL");

        char[] arr = s.toCharArray();
        boolean b = false;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 48; j < 58; j++) {
                if(arr[i] == j) {
                    b = true;
                    return;
                }
            }
            if (b == false)
                throw new FormatException("wrong value");
            else {
                //закончить
            }
        }


    }
}
