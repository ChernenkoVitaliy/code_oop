package com.company.examples.m2_3.interfaces.sample1;

public class Car implements Colored, WithWeight {
    public String getName() {
        return "car";
    }

    @Override
    public int getColor() {
        return BLUE;
    }

    @Override
    public int getWeirht() {
        return 0;
    }
}
