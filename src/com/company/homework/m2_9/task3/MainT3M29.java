package com.company.homework.m2_9.task3;

/*Написать сервер, который будет отправлять пользователю информацию о системе и номер запроса.(+)*/

public class MainT3M29 {
    public static void main(String[] args) {
        MyServer server = new MyServer(21000);
        server.start();
    }
}
