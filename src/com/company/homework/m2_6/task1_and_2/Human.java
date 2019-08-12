package com.company.homework.m2_6.task1_and_2;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Human implements Cloneable, Serializable {
    private static final long serialVersionUID = 8216545686369813896L;
    private String name;
    private String surname;
    private Date birth;
    private Gender gender;

    public Human(String name, String surname, Date birth, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirth() {
        return birth;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) &&
                surname.equals(human.surname) &&
                birth.equals(human.birth) &&
                gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birth, gender);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth=" + birth +
                ", gender=" + gender +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Human o = (Human) super.clone();
        o.birth = (Date) birth.clone();
        return o;
    }
}
