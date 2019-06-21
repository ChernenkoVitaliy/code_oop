package com.company.homework.m2_3.task4;


import java.util.Date;

public abstract class Human {
    protected String name;
    protected String surnamre;
    protected Date birth;
    protected long id;

    public Human(String name, String surnamre, Date birth, long id) {
        this.name = name;
        this.surnamre = surnamre;
        if (birth.getTime() > System.currentTimeMillis())
            throw new MyException("Age can't be from future(probably) " + birth);
        this.birth = birth;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnamre() {
        return surnamre;
    }

    public void setSurnamre(String surnamre) {
        this.surnamre = surnamre;
    }

    public Date getBirth() {
        return birth;
    }

    public long getId() {
        return id;
    }
}
