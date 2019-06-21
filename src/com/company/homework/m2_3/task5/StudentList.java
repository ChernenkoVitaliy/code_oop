package com.company.homework.m2_3.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentList {
    private Student[] list = new Student[100];
    private int p = 0;

    public void add(Student s) {
        //предусмотреть выходха переделы списка
        if (p >= list.length) {
            Student[] swap = list.clone();
            list = new Student[list.length + 100];
            System.arraycopy(swap, 0, list, 0, swap.length);
            list[p++] = s;
        }else {
            list[p++] = s;
        }
    }

    public Student get(int n) {
        return list[n];
    }


    //поиск студента в списке по имени. Возвращает индекс первого совпадения. Если не совпадения нет, возвращаем -1
    public int findByName(String name) {
        for (int i = 0; i < p; i++) {
            if (list[i].getName().equalsIgnoreCase(name))
                return i;
        }

        return -1;
    }

    //поиск студента в списке по фамилии. Возвращает индекс первого совпадения. Если не совпадения нет, возвращаем -1
    public int findBySurname(String surname) {
        for (int i = 0; i < p; i++) {
            if (list[i].getSurname().equalsIgnoreCase(surname))
                return i;
        }

        return -1;
    }

    //поиск студента в списке по дате рождения. Возвращает индекс первого совпадения. Если не совпадения нет, возвращаем -1
    public int findByBirth(Date birth) {
        for (int i = 0; i < p; i++) {
            if (list[i].getBirth().equals(birth))
                return i;
        }

        return -1;
    }


    //удаление студента из списка
    public boolean del(int index) {
        //индекс дожен быть больше 0
        if (index <= p && index >= 0) {
            //создаем временный массив(копия оригинала)
            Student[] temp = list.clone();
            //если индекс равен нулю копируем с первой ячейки массива и доканца
            if (index == 0) {
                System.arraycopy(temp, 1, list, 0, temp.length - 1);
                p--;//ументьшаем счетчик массива
                return true;
            }else {//если индекс больше нуля
                //копируем с 0 до индекса
                System.arraycopy(temp, 0, list, 0, index - 1);
                //копируем с индекса и до конца
                System.arraycopy(temp, index, list, index - 1, temp.length - index - 1);
                p--;//ументьшаем счетчик массива
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < p; i++)
            sb.append(list[i]);

        return sb.toString();
    }
}
