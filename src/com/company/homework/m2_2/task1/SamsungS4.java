package com.company.homework.m2_2.task1;

public class SamsungS4 extends Phone{
    public SamsungS4() {
        System.out.println("SamsungS4 constructor");
        screenSize = 5;
        hasWiFi = true;
    }

    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("SamsungS4 class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("SamsungS4 class is sending sms " + message + " Hello" + " to " + number);
    }
}
