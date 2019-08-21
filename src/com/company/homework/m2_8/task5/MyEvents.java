package com.company.homework.m2_8.task5;

public class MyEvents implements IFileEvents {
    @Override
    public void onFileChanged(String path) {
        System.out.println("File changed: " + path);
    }

    @Override
    public void onFileAdded(String path) {
        System.out.println("File added: " + path);
    }

    @Override
    public void onFileDeleted(String path) {
        System.out.println("File deleted: " + path);
    }
}
