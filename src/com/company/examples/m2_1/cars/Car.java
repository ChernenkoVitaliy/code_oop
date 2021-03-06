package com.company.examples.m2_1.cars;

public class Car {
    private String name;
    private Engine engine;
    private Climate climate = new Climate();

    public Car(String name) {
        this.name = name;
        engine = new Engine(0);
    }

    public Car(String name, double mileage) {
        this.name = name;
        engine = new Engine(mileage);
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
        climate.turnOff();
        engine.turnOff();
    }

    public void start(int speed, double hours) {
        if (engine.isStarted()) {
            double distance = hours * speed;
            engine.addMileage(distance);
        }
    }
}
