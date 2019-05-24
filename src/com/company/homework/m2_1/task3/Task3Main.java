package com.company.homework.m2_1.task3;

/*1.Написать класс "автомобиль", который должен уметь заводится, глушить мотор, ехать и держать скорость.*/
/*2.Добавить свойство "объем двигателя" в класс Engine*/
/*3.Написать код для вывода потраченого топлива на экран*/

public class Task3Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 2.0f);
        Car ferrari = new Car("Ferrari", 3.0f, 20_000);

        bmw.turnOn();
        ferrari.turnOn();

        final int[] speeds = new int[] {20, 60, 100};

        for (int s : speeds) {
            bmw.start(s, 0.5);
        }

        for (int s : speeds) {
            ferrari.start(s, 1);
        }



        System.out.println(bmw.getName() + ": " + bmw.getMileage() + ", fuel: " + bmw.fuelСonsumption() + "L");
        System.out.println(ferrari.getName() + ": " + ferrari.getMileage() + ", fuel: " + ferrari.fuelСonsumption() + "L");

        bmw.turnOff();
        ferrari.turnOff();
    }
}
