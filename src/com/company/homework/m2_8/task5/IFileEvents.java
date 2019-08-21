package com.company.homework.m2_8.task5;

public interface IFileEvents {
    void onFileChanged(String path);
    void onFileAdded(String path);
    void onFileDeleted(String path);
}
