package com.company.homework.m2_1.task3;

public class Car {
    private String name;
    private Engine engine;
    private Climate climate = new Climate();
    private float fuelCons;

    public Car(String name, float volume) {
        this.name = name;
        engine = new Engine(volume, 0);
    }

    public Car(String name, float volume, double mileage) {
        this.name = name;
        engine = new Engine(volume, mileage);
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return engine.getMileage();
    }

    public void turnOn() {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
    }

    public void turnOff() {
        engine.turnOff();
        climate.turnOff();
        fuelCons = 0;
    }

    public void start(int speed, double hours) {
        if (engine.isStarted()) {
            double distance = hours * speed;
            engine.addMileage(distance);
            fuelCons += (float) ((engine.getFuelСonsumption() / 100) * distance);
        }
    }

    public double fuelСonsumption(){
        return fuelCons;
    }
}
