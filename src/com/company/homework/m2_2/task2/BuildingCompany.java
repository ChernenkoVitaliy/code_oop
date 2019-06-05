package com.company.homework.m2_2.task2;

import java.util.Date;

public class BuildingCompany extends Company {

    public BuildingCompany(String name, Date birht, String nameOfDiretor) {
        super(name, birht, nameOfDiretor);
    }

    @Override
    public void doJob() {
        System.out.println("Building company build something");
    }
}
