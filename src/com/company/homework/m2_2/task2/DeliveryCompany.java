package com.company.homework.m2_2.task2;

import java.util.Date;

public class DeliveryCompany extends Company {


    public DeliveryCompany(String name, Date birht, String nameOfDiretor) {
        super(name, birht, nameOfDiretor);
    }

    @Override
    public void doJob() {
        System.out.println("Delivery company deliver something");
    }
}
