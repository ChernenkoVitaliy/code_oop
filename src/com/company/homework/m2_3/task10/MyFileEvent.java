package com.company.homework.m2_3.task10;

public class MyFileEvent implements IFileEvent {
    @Override
    public void fileAdded(String file) {
        System.out.println("File added: " + file);
    }
}
