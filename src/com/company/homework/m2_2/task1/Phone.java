package com.company.homework.m2_2.task1;

public abstract class Phone {
    protected boolean touch;
    protected boolean hasWiFi;
    protected int screenSize;
    protected double countOfCalls;
    protected double coutnOfSms;

    public Phone() {
        System.out.println("Phone constructor");
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void call(String number) {
        countOfCalls++;
    }

    public  void sendSMS(String number, String message) {
        coutnOfSms++;
    }

    public double getCountOfCalls() {
        return countOfCalls;
    }

    public double getCoutnOfSms() {
        return coutnOfSms;
    }
}
