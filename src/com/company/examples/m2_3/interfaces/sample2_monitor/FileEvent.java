package com.company.examples.m2_3.interfaces.sample2_monitor;

public class FileEvent implements IFileEvent {
    @Override
    public void onFileAdde(String s) {
        System.out.println("File added: " + s);
    }
}
