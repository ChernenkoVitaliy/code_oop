package com.company.homework.m2_3.task6;

public class Human implements Comparable{
    private int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Object o) {
        Human h = (Human) o;
        if (this.age < h.age)
            return 1;
        else if(this.age == h.age)
            return 0;
        else if (this.age > h.age)
            return -1;
        else
            return 0;
    }
}
