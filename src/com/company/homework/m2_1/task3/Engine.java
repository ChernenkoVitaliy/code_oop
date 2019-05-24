package com.company.homework.m2_1.task3;

/*2л = 10л на 100км*/
/*3л = 15л на 100км*/

public class Engine {
    private double mileage;
    private boolean started;
    private float volume;
    private float fuelСonsumption;

    public Engine(float volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
        if (volume == 2)
            fuelСonsumption = 10;
        else if (volume == 3)
            fuelСonsumption = 15;
        else
            fuelСonsumption = 0;
    }

    public float getVolume() {
        return volume;
    }

    public float getFuelСonsumption() {
        return fuelСonsumption;
    }

    public double getMileage() {
        return mileage;
    }

    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }

    public boolean isStarted() {
        return started;
    }

    public void turnOn() {
        started = true;
    }

    public void turnOff() {
        started = false;
    }
}
