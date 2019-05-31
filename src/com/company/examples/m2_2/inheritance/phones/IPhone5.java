package com.company.examples.m2_2.inheritance.phones;

public class IPhone5 extends IPhone {

    public IPhone5() {
        System.out.println("IPhone5 constructor");

        screenSize = 4;
        imei = "1111111111111";
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("IPhone5 class is sending sms " + message + " to " + number);
    }
}
