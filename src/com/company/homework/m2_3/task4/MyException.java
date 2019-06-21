package com.company.homework.m2_3.task4;

/*Если в класс humman передается дата больше чем сейчас, бросаем исключение*/


public class MyException extends RuntimeException{

    public MyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Wrong age, " + super.getMessage();
    }
}
