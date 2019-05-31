package com.company.homework.m2_1.task4;

/*1.Сделать поиск по фамилии(+)
* 2.Сделать поиск по дате рождения(+)
* 3.Сделать функцию удаления студента из списка(+)
* 4.Предусмотреть выход за пределы списка(+)*/

import java.util.Arrays;
import java.util.Date;

public class MainOfStudentList {
    public static void main(String[] args) {
        final StudentList list = new StudentList();

        //добавляем студентов в список
        list.add(new Student("Vova", "Ivanov", new Date(1986 - 1900, 1, 1)));
        list.add(new Student("Vasya", "Pupkin", new Date(1991 - 1900, 3, 28)));


        //ищем студента по имени
        int n = list.findByName("Vova");
        if (n >= 0)
            System.out.println(list.get(n).getBirth().toString());
        else
            System.out.println("Not much for name Vova");


        //ищем студента по фамилии
        n = list.findBySurname("Pupkin");
        if (n >= 0)
            System.out.println(list.get(n).getBirth().toString());
        else
            System.out.println("Not much for surname Pupkin");


        //ищем студента по дате рождения
        n = list.findByBirth(new Date(1986 - 1900, 01, 01));
        if (n >= 0)
            System.out.println(list.get(n).getSurname());
        else
            System.out.println("Not much for birth");


        //проверка на удаление студента из списка
        System.out.println("**********************************************");
        System.out.println("Before Deleting...................");
        //добавляем несколько студентов для теста удаления
        for (int i = 0; i < 10; i++) {
            list.add(new Student("Test" + i, "Testov" + i, new Date(1986 + i - 1900, i, 02 + i)));
        }
        //выводим список до удаления
        System.out.println(list);

        System.out.println("After Deleting..........................");
        //удаляем несколько студентов из списка
        list.del(6);
        list.del(3);
        list.del(9);
        list.add(new Student("Blsh", "BlahBlah", new Date(1991 - 1900, 01, 05)));
        //выводим список после удаления
        System.out.println(list);


        //проверка на переполнение
        //добавляем 200 студентов в список изначально длинна которого 100
        for (int i = 0; i < 200; i++) {
            list.add(new Student("Test" + i, "OutOfLength", new Date(1991 - 1900,  02,  10)));
        }
        //выводим список после добавления 200 студентов
        System.out.println(list);
    }
}
