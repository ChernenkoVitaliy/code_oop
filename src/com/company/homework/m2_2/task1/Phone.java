package com.company.homework.m2_2.task1;

public abstract class Phone {
    protected boolean touch;
    protected boolean hasWiFi;
    protected int screenSize;
    protected double countOfCalls;
    protected double coutnOfSms;
    protected int number;
    protected NumbersList list;

    public Phone(int number, NumbersList numbersList) {
        list = numbersList;
        numbersList.add(this);
        this.number = number;
    }

    public int getNumber() {
        return number;
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

    public void call(int number) {
        if (list.findByNumber(number) == -1) {
            System.out.println("Number: " + number + " not found!!");
        }else {
            int n = list.findByNumber(number);
            Phone phone = list.get(n);
            phone.answer();
        }
        countOfCalls++;
    }

    public void answer() {
        System.out.println("Number: " + number + " is answer BLAH BLAH");
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
