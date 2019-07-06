package com.company.homework.m2_3.task10;

/*Написать код для мониторинга каталога. Выводить на экран предупреждение
 если в каталг добавляется текстовый файл (.txt)*/

import java.io.IOException;

public class MyClass {
    public static void main(String[] args) {
        String path = "C:\\Users\\unknown\\Desktop\\Java ООП\\otherFiles\\canDelete";
        Monitor monitor = new Monitor(path, ".txt", new MyFileEvent());

        try {
            monitor.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

