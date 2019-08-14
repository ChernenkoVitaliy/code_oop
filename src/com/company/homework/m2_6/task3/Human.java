package com.company.homework.m2_6.task3;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Human implements Serializable {
    private static final long serialVersionUID = -7933678389558262128L;
    private String name;
    private String surname;
    private Calendar birth;
    private Gender gender;

    public Human(String name, String surname, Gender gender, int birthDay, int birthMonth, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;

        //добавить проверку на корректность дат. Если, например, число отрицательное или месяц больше 12 бросать исключение и т д
        birth = new GregorianCalendar(birthYear, birthMonth, birthDay);
     }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirth() {
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
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(birth, human.birth) &&
                gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birth, gender);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth=" + sdf.format(birth.getTime()) +
                ", gender=" + gender +
                '}';
    }
}
