package com.company.homework.m2_2.task4;

//задача1

public class MidleDeveloper extends Developer {

    public MidleDeveloper(String name, double basicSalary, int experiance) {
        super(name, basicSalary, experiance);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 1.5) + (experiance > 0 ? basicSalary * experiance * 0.1 : 0);
    }
}
