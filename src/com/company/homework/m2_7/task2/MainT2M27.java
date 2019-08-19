package com.company.homework.m2_7.task2;

/*Написать метод, который создаст список, положит в него 10 элементов, затем удалит первые два и последний, а
* затем выведет результат на экран.(+)*/

import java.util.ArrayList;
import java.util.List;

public class MainT2M27 {
    public static void main(String[] args) {
        someJob();
    }

    private static void someJob() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.subList(0, 3).clear();
        list.remove(list.size() - 1);

        for (Integer i : list)
            System.out.println(i);
    }
}
