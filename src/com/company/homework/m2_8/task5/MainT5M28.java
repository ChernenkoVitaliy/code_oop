package com.company.homework.m2_8.task5;

/*Изменить проект монитор так, чтобы файлы старше N минут автоматически удалялись.(+)*/

public class MainT5M28 {
    public static void main(String[] args) {
        String path = "path......";
        Monitor monitor = new Monitor(path);
        monitor.setTimeout(2000);
        monitor.setEvents(new MyEvents());
        monitor.start();
    }
}
