package com.company.examples.m2_2.polymorphism.cars;

public class BMW_M extends BMW {

    @Override
    public String getName() {
        return super.getName() + "_M";
    }
}
