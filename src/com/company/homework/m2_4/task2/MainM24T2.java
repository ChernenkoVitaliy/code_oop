package com.company.homework.m2_4.task2;

/*Написать программу, которая считает текстовый файл, заменит в нем все слова "Hello" на "1234"
* и запишет изменения в тот-же файл(+)*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainM24T2 {
    public static void main(String[] args) {
        //путь к файлу
        String path = "D:\\my_files\\java\\java oop\\files for test\\ffff\\1.txt";
        StringBuilder sb = new StringBuilder();

        //читаем содержимое файла в StringBuilder. Если файл большой то этот алгоритм не подойдет
        try (FileInputStream in = new FileInputStream(path)){
            byte[] buf = new byte[1024];
            int r;


            do {
                r = in.read(buf, 0, buf.length);
                if (r > 0) {
                    sb.append(new String(buf, 0, r));
                }
            }while (r > 0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //выводим в консоль то что вычитали из файла. Чисто для наглядности
        System.out.println(sb.toString());

        //Пишем в файл
        try(FileOutputStream out = new FileOutputStream(path)) {
            //если в стрингбилдере что-то есть
            if (sb.length() > 0){
                //конвертируем это в строку, затем заменяем нужные фразы, затем конвертируем в массив байтов
                byte[] buf = sb.toString().replace("Hello", "1234").getBytes();
                //пишем в файл
                out.write(buf);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
