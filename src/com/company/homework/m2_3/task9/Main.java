package com.company.homework.m2_3.task9;

/*Добавить в проэкт "монитор" функцию мониторинга более одного файла*/

public class Main {
    public static void main(String[] args) {
        String[] arr = {"C:\\Users\\unknown\\Desktop\\Java ООП\\otherFiles\\11.txt",
                "C:\\Users\\unknown\\Desktop\\Java ООП\\otherFiles\\12.txt",
                "C:\\Users\\unknown\\Desktop\\Java ООП\\otherFiles\\13.txt"

        };

        Monitor monitor = new Monitor(arr, new FileEvent());

        monitor.start();
    }
}
