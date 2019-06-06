package com.company.homework.m2_2.task1;

public class SamsungS4 extends Phone{
    public SamsungS4(int number, NumbersList numbersList) {
        super(number, numbersList);

        screenSize = 5;
        hasWiFi = true;
    }

    @Override
    public void call(int number) {
        System.out.println("SamsungS4 class is calling " + number);
        super.call(number);
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("SamsungS4 class is sending sms " + message + " Hello" + " to " + number);
    }
}
