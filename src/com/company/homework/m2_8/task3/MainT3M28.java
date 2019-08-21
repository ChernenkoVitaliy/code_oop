package com.company.homework.m2_8.task3;

/*Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap.(+)*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainT3M28 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3, 3, 55, 55, 55};
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i ++) {
            if (map.containsKey(arr[i])) {
                if (count == 0)
                    count = 1;
                count++;
            }else {
                map.put(arr[i], arr[i]);
            }
        }

        System.out.println(count);

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
