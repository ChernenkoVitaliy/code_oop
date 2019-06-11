package com.company.homework.m2_2.task4;

public class JuniorDeveloper extends Developer {

    public JuniorDeveloper(String name, double basicSalary, int experiance) {
        super(name, basicSalary, experiance);
    }

    @Override
    public double getSalary() {
        return basicSalary + (experiance > 0 ? basicSalary * experiance * 0.1 : 0);
    }
}
