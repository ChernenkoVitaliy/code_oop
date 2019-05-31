package com.company.examples.m2_2.inheritance.phones;

public abstract class Phone {
    protected boolean touch;
    protected boolean hasWiFi;
    protected int screenSize;

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
        System.out.println("Phone class is colling " + number);
    }

    public abstract void sendSMS(String number, String message);
}
