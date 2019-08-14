package com.company.homework.m2_6.task3;

/*Написать программу, которая запросит ввести с консоли информацию о 10 людях, запишет ее на диск, а при следующем
* старте прочитает записи и выведет сохраненные данные на экран. Одинаковые записи должны игнорироваться(Set + equals*)*/

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class MainT3M26 {
    public static void main(String[] args) throws IOException {
        Set<Human> list = new HashSet<>();//лист для заполнения из консоли
        RWHuman rwHuman = new RWHuman();//класс который считывает с консоли, записывает в файл и считывает из файла
        String src = "D:\\my_files\\java\\java oop\\files for test\\objs.out";

        rwHuman.readFromConsole(list);//считываем 3 чюмана с консоли
        rwHuman.writeIntoFile(list, src);//записываем хюменов в файл(сериализация)
        Set<Human> listAfter = rwHuman.readFromFile(src);//считываем хюменов из файла(десериализация)

        for(Human h : list)
            System.out.println(h);

        for (Human h: listAfter)
            System.out.println(h);
    }
}
