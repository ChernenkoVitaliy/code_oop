package com.company.homework.m2_3.task9;

public class FileEvent implements IFileEvent {

    //delete this method
    @Override
    public void onFileAdded(String path) {
        System.out.println("File added: " + path);
    }

    @Override
    public void onAllFilesAdded(String[] paths) {
        System.out.println("All files added: ");

        for (String s: paths)
            System.out.println(s);
    }
}
