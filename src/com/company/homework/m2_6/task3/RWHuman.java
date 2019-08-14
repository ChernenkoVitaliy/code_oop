package com.company.homework.m2_6.task3;

/*В этом класе реализованы методы для чтения Хюманов с консоли, записи их в файл, чтения их из файла*/

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class RWHuman {
    private final int count = 3;//количество объектов
    private Set<Human> list;

    public void readFromConsole(Set<Human> list) {
        //В методе читаем данные с консоли, создаем хюмана на основе этих данных
        //Нету проверок на корректность ввода данных поскольку нету времени на реализацию.
        try(BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in))) {
            String name;
            String surname;
            String gender;
            int day;
            int month;
            int year;

            for (int i = 0; i < count; i++) {
                System.out.println("Enter only correct values!!!");
                System.out.print("Enter name: ");
                name = scanner.readLine();
                System.out.print("Enter surname: ");
                surname = scanner.readLine();
                System.out.print("Enter gender(male or female): ");
                gender = scanner.readLine();
                System.out.print("Enter dayOfBirth: ");
                day = Integer.parseInt(scanner.readLine());
                System.out.print("Enter monthOfBirth: ");
                month = Integer.parseInt(scanner.readLine());
                System.out.print("Enter yearOfBirth: ");
                year = Integer.parseInt(scanner.readLine());

                //плохая реализация, но сделана она исключительно для теста
                Gender gender1 = Gender.MALE;
                if (gender.equals("male"))
                    gender1 = Gender.MALE;
                else if (gender.equals("female"))
                    gender1 = Gender.FEMALE;

                list.add(new Human(name, surname, gender1, day, month, year));
            }
            System.out.println("Done!!!");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void writeIntoFile(Set<Human> list, String dest) {
        try (FileOutputStream fos = new FileOutputStream(dest);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            if (list != null){
                for (Human h : list){
                    oos.writeObject(h);
                }
                System.out.println("Done.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Set<Human> readFromFile(String src) {
        try (FileInputStream fis = new FileInputStream(src);
            ObjectInputStream ois = new ObjectInputStream(fis)){
            Set<Human> list = new HashSet<>();

            for (int i = 0; i < count; i++) {
                list.add((Human) ois.readObject());
            }
            return list;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return list;
    }
}
