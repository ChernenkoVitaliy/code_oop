package com.company.homework.m2_8.task4;

/*Пользователь вводит набор чисел в виде одной строки("1, 2, 3, 4, 4, 5"). Избавиться от повторяюшихся
*  элементов в строке и вывести результат на экран.(+)*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainT4M28 {
    public static void main(String[] args) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String s;

        try {
            System.out.print("Enter sequence of numbers(1, 2, 3, 4, 4, 5): ");
            s = scanner.readLine();
            String[] arr = s.split(",");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].trim();
            }

            System.out.print("Before: ");
            System.out.println(Arrays.toString(arr));
            System.out.print("After: ");
            Set<String> set = new HashSet<>(Arrays.asList(arr));
            for (String s1 : set)
                System.out.print(s1 + ", ");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
