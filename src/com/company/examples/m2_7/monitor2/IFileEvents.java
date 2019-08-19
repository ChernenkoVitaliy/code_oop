package com.company.examples.m2_7.monitor2;

public interface IFileEvents {
    void onFileAdded(String path);
    void onFileDeleted(String path);
}
