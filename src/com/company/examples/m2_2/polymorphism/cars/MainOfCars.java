package com.company.examples.m2_2.polymorphism.cars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Пример работы полиморфизма*/

public class MainOfCars {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number from 1 to 3: ");
        String s = bufferedReader.readLine();

        Car car = new Car();

        System.out.println(car.getName());

        if (s.equals("1"))
            car = new BMW();
        else if (s.equals("2"))
            car = new BMW_M();
        else
            car = new Lada();

        System.out.println(car.getName());
    }
}
