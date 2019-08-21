package com.company.examples.m2_8.sample1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Human1");
        map.put(2, "Human2");

        System.out.println(map.get(1) + ", " + map.get(2) + ", " + map.get(3));

        //1
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set)
            System.out.println(entry.getKey() + " = " + entry.getValue());

        //2
        Set<Integer> set1 = map.keySet();
        for (Integer key : set1)
            System.out.println(map.get(key));

        //3
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
