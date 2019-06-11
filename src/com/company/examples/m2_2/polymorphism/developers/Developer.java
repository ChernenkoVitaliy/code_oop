package com.company.examples.m2_2.polymorphism.developers;

public abstract class Developer {
    protected String name;
    protected double basicSalary;
    protected int experiance;

    public Developer(String name, double basicSalary, int experiance) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.experiance = experiance;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public abstract double getSalary();
}
