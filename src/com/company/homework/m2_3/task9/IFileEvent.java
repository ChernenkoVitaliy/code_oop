package com.company.homework.m2_3.task9;

public interface IFileEvent {
    void onFileAdded(String path); //delete
    void onAllFilesAdded(String[] paths);
}
