package com.company.homework.m2_3.task5;

/*Модифицировать проэкт "Список студентов" так, чтобы
* 1. список вводился с клавиатуры(+)
* 2. была возможность удалять студента по номеру(+)
* 3. при введении неправильных данных (пустое имя, неправильная дата) программа кидала исключение
*    и обрабатывала его с выводом соответстуещего сообщения на экран(+)*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainOfStudentList {
    final static StudentList list = new StudentList();
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        boolean b = false; //вспомогательная переменная для цикла
        String yesOrNo = "N"; //вспомогательная строка для цикла

        //читаем ввод с клавиатуры
        do {
            System.out.print("Do you want add new student(Y/N): ");
            try {
                yesOrNo = bufferedReader.readLine();
                if (yesOrNo.equalsIgnoreCase("Y")) {
                    readStudentFromKeyboard();
                    System.out.println();
                    b = true;
                }else if (yesOrNo.equalsIgnoreCase("N")) {
                    b = false;
                    System.out.println("BYE");
                }else {
                    System.out.println("Wrong input!!!");
                    b = true;
                    continue;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }while (b);


        //добавляем студентов в список
        list.add(new Student("Vova", "Ivanov", new Date(1986 - 1900, 1, 1)));
        list.add(new Student("Vasya", "Pupkin", new Date(1991 - 1900, 3, 28)));


        System.out.println();
        System.out.println(list);

    }


    static void readStudentFromKeyboard() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String name;
        String surname;
        Date birth;

        //считываем одного студента с клавиатуры
        try {
            System.out.print("Enter name of student: ");
            name = bufferedReader.readLine();
            System.out.print("Enter surname of student: ");
            surname = bufferedReader.readLine();
            System.out.print("Enter birth of student(in format dd.MM.yyyy): ");
            birth = sdf.parse(bufferedReader.readLine());

            list.add(new Student(name, surname, birth));
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
