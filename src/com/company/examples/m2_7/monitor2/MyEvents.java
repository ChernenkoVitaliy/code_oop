package com.company.examples.m2_7.monitor2;

public class MyEvents implements IFileEvents{
    @Override
    public void onFileAdded(String path) {
        System.out.println("File added: " + path);
    }

    @Override
    public void onFileDeleted(String path) {
        System.out.println("File deleted: " + path);
    }
}
