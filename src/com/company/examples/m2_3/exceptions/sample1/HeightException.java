package com.company.examples.m2_3.exceptions.sample1;

public class HeightException extends Exception {

    public HeightException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "HeightException " + super.getMessage();
    }
}
