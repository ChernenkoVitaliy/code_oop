package com.company.homework.m2_2.task1;

public class Nokia3310 extends Phone {

    public Nokia3310(int number, NumbersList numbersList) {
        super(number, numbersList);

        touch = false;
        hasWiFi = false;
        screenSize = 2;
    }


    @Override
    public void call(int number) {
        System.out.println("Nokia3310 class is calling " + number);
        super.call(number);
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("Nokia3310 class is sending SMS " + message + " to " + number);
    }
}
