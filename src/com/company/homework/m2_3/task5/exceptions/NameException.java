package com.company.homework.m2_3.task5.exceptions;

public class NameException extends RuntimeException {

    public NameException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Wrong name!!!" + super.getMessage();
    }
}
