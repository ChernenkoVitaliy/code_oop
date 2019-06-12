package com.company.examples.m2_3.exceptions.sample1;

public class WidthException extends Exception {
    public WidthException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "WidthException " + super.getMessage();
    }
}
