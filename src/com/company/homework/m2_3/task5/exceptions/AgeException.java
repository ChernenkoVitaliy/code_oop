package com.company.homework.m2_3.task5.exceptions;

public class AgeException extends RuntimeException {

    public AgeException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Wrong Age!!! " + super.getMessage();
    }
}
