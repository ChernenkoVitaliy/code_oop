package com.company.homework.m2_2.task2;

import java.util.Date;

//можно было сделать как интерфейс, но для примера сделан как абстрактный класс

public abstract class Company {
    protected String name;
    protected Date birht;
    protected String nameOfDiretor; //это поле должно быть реализовано как отдельный класс(Human), но для примера сделано просто как строка

    public Company() {}

    public Company(String name, Date birht, String nameOfDiretor) {
        this.name = name;
        this.birht = birht;
        this.nameOfDiretor = nameOfDiretor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirht() {
        return birht;
    }

    public void setBirht(Date birht) {
        this.birht = birht;
    }

    public String getNameOfDiretor() {
        return nameOfDiretor;
    }

    public void setNameOfDiretor(String nameOfDiretor) {
        this.nameOfDiretor = nameOfDiretor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name)
                .append(" Birth: ").append(birht)
                .append(" Director: ").append(nameOfDiretor);
        return sb.toString();
    }

    public abstract void doJob();
}
