package com.company.examples.m2_3.interfaces.sample3_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human[] list = {new Human(40), new Human(2), new Human(12), new Human(30)};

        Arrays.sort(list);

        for (Human h : list)
            System.out.println(h.getAge());
    }
}
