package com.company.homework.m2_3.task5.exceptions;

public class SurnameException extends RuntimeException {

    public SurnameException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Wrong surname!!!" + super.getMessage();
    }
}
