package com.company.homework.m2_3.task8;

import java.io.File;
import java.util.Date;

public class FileEvent implements IFileEvent {
    @Override
    public void onFileAdded(String s) {
        File file = new File(s);
        System.out.println("File added: " + s + " " + new Date(file.lastModified()));
    }
}
