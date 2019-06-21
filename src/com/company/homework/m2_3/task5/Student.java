package com.company.homework.m2_3.task5;

import com.company.homework.m2_3.task5.exceptions.AgeException;
import com.company.homework.m2_3.task5.exceptions.NameException;
import com.company.homework.m2_3.task5.exceptions.SurnameException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Date birth;

    public Student(String name, String surname, Date birth) {
        if (name == null || name.length() ==0)
            throw new NameException(" Name can't be null");
        this.name = name;


        if (surname == null || surname.length() == 0)
            throw new SurnameException(" Surname can't be null");
        this.surname = surname;


        if(birth.getTime() > System.currentTimeMillis())
            throw new AgeException("Age can't be from future(probably): " + birth);
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return "Name: " + name + ", Surname: " + surname + ", Birth: " + sdf.format(birth) + "\n";
    }
}
