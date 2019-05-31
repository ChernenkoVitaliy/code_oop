package com.company.examples.m2_2.inheritance.phones;

public class MainOfPhones {
    public static void main(String[] args) {
        //Phone phone = new Phone(); ошибка т.к. класс абстрактный

        Nokia3310 nokia3310 = new Nokia3310();
        System.out.println("Nolia3310 screen size: " + nokia3310.getScreenSize());
        nokia3310.call("123-45-67");
        nokia3310.sendSMS("567-89-10", "text message");
        System.out.println("--------------------------------------------");


        IPhone iPhone = new IPhone();
        System.out.println("IPhone screen size: " + iPhone.getScreenSize());
        iPhone.call("133-45-67");
        iPhone.sendSMS("133-45-67", "texm message");
        System.out.println("---------------------------------------------");


        IPhone5 iPhone5 = new IPhone5();
        System.out.println("IPhone5 screen size: " + iPhone5.getScreenSize());
        iPhone5.call("123-45-67");
        iPhone5.sendSMS("123-45-67", "text message");
    }
}
