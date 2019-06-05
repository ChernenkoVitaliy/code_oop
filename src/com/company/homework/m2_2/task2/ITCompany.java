package com.company.homework.m2_2.task2;

import java.util.Date;

public class ITCompany extends Company {


    public ITCompany(String name, Date birth, String nameOfDiretor) {
        super(name, birth, nameOfDiretor);
    }

    @Override
    public void doJob() {
        System.out.println("IT company wright some code");
    }
}
