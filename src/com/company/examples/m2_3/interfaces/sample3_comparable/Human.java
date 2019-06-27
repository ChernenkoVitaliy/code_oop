package com.company.examples.m2_3.interfaces.sample3_comparable;

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
            return -1;
        else if (this.age == h.age)
            return 0;
        else if (this.age > h.age)
            return 1;
        else
            return 0; //to make compiler happy
    }
}
