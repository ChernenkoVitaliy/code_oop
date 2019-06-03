package com.company.homework.m2_2.task1;

public class IPhone extends Phone {
    protected String imei;

    public IPhone() {
        System.out.println("IPhone constructor");

        touch = true;
        hasWiFi = true;
        screenSize = 3;
    }


    @Override
    final public void call(String number) {
        super.call(number);
        System.out.println("IPhone class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("IPhone class is sending sms " + message + " to" + number);
    }
}
