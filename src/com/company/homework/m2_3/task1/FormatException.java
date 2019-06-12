package com.company.homework.m2_3.task1;

public class FormatException extends Exception {
    public FormatException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "FormatException: " + super.getMessage();
    }
}
