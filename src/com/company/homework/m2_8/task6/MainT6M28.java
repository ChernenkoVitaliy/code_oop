package com.company.homework.m2_8.task6;

/*Написать программу "База данных пользователей" с функциями добавления, удаления, поиска и вывода информации о
* пользователе по номеру.(+)*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainT6M28 {
    public static void main(String[] args) throws Exception {
        DataBase db = DataBase.getDb();
        int chose ;

        try (BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in))){
            do {

                showMenu();
                 chose = Integer.parseInt(reader.readLine());
                if (chose >= 0 && chose < 5) {
                    switch (chose){
                        case 0:
                            return;
                        case 1:
                            System.out.print("Enter name: ");
                            String name = reader.readLine();
                            System.out.print("Enter surname: ");
                            String surname = reader.readLine();
                            db.add(new Person(name, surname));
                            break;
                        case 2:
                            System.out.print("Enter id: ");
                            db.delete(Integer.parseInt(reader.readLine())); break;
                        case 3:
                            System.out.print("Enter id: ");
                            db.search(Integer.parseInt(reader.readLine())); break;
                        case 4:
                            db.showAll(); break;
                    }
                }else {
                    System.out.println("Number " + chose + " does not exist in this menu.");
                }
            } while (true);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void showMenu() {
        System.out.println("Menu:");
        System.out.println("    1 - add person");
        System.out.println("    2 - delete person");
        System.out.println("    3 - search person");
        System.out.println("    4 - show all");
        System.out.println("    0 - EXIT");
    }
}
