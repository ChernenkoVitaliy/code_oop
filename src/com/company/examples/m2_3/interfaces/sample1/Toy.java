package com.company.examples.m2_3.interfaces.sample1;

public class Toy implements Colored, WithWeight {
    @Override
    public int getColor() {
        return RED;
    }

    @Override
    public int getWeirht() {
        return 50;
    }
}
