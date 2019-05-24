package com.company.examples.m2_1.studentList;

import java.util.Date;

public class MainOfStudentList {
    public static void main(String[] args) {
        final StudentList list = new StudentList();

        list.add(new Student("Vova", "Ivanov", new Date(1986 - 1900, 1, 1)));
        list.add(new Student("Vasya", "Pupkin", new Date(1970 - 1900, 3, 28)));

        int n = list.find("Vova");
        System.out.println(list.get(n).getBirth().toString());
    }
}
