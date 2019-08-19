package com.company.homework.m2_7.task5;

public interface IFileEvents {
    void onFileAdded(String path);
    void onFileDeleted(String path);
}
