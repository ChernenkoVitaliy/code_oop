package com.company.homework.m2_2.task5;

/*Написать программ, которая будет рисовать прямоугольник с заданными длиннами сторон(+).*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*   **********
        *    *        *
        *    *        *
        *    **********  */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        System.out.print("\nEnter width: ");
        int width = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                for (int j = 0; j < width; j++){
                    System.out.print("*");
                }
            }else {
                for (int k = 0; k < width; k++) {
                    if (k == 0 || k == width - 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
