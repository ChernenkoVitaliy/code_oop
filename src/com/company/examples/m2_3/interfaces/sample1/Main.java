package com.company.examples.m2_3.interfaces.sample1;

public class Main {
    public static void main(String[] args) {
        WithWeight ww = new Hamburger();
        System.out.println("Hamburger weight = " + ww.getWeirht());

        ww = new Toy();
        System.out.println("Toy weight = " + ww.getWeirht());


        System.out.println("Colors: ");
        Colored[] coloredList = {new Toy(), new BMW(), new Rectangle(5, 7)};
        for (Colored c : coloredList)
            System.out.println("\t" + c.getColor());


        Car car = new BMW();
        System.out.println("Car weight: " + car.getWeirht());
    }
}
