package com.company.examples.m2_2.polymorphism.developers;

public class SeniorDeveloper extends Developer {

    public SeniorDeveloper(String name, double basicSalary, int experiance) {
        super(name, basicSalary, experiance);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 2) + (experiance > 0 ? basicSalary * experiance * 0.1 : 0);
    }
}
