package com.company.homework.m2_2.task1;

public class Nokia3310 extends Phone {

    public Nokia3310() {
        System.out.println("Nokia3310 constructor");

        touch = false;
        hasWiFi = false;
        screenSize = 2;
    }


    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("Nokia3310 class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("Nokia3310 class is sending SMS " + message + " to " + number);
    }
}
