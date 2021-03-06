package com.company.homework.m2_2.task1;

public class IPhone5 extends IPhone {

    public IPhone5(int number, NumbersList numbersList) {
        super(number, numbersList);

        screenSize = 4;
        imei = "1111111111111";
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("IPhone5 class is sending sms " + message + " to " + number);
    }
}
