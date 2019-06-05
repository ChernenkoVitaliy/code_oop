package com.company.homework.m2_2.task2;

/*Придумать любую свою иерархию классов*/

import java.util.Date;

public class MainOfCompanies {
    public static void main(String[] args) {
        ITCompany itCompany = new ITCompany("MyITSpace", new Date(2019 - 1900, 06, 05), "My Name");
        itCompany.doJob();

        DeliveryCompany deliveryCompany = new DeliveryCompany("MyDeliverSpace", new Date(2018 - 1900, 06, 05), "My Name");
        deliveryCompany.doJob();

        System.out.println(itCompany);
    }
}
