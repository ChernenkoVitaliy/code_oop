package com.company.examples.m2_2.polymorphism.developers;

public class TeamLeadDeveloper extends Developer{


    public TeamLeadDeveloper(String name, double basicSalary, int experiance) {
        super(name, basicSalary, experiance);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 4) + (experiance > 0 ? basicSalary * experiance * 0.1 : 0);
    }
}
