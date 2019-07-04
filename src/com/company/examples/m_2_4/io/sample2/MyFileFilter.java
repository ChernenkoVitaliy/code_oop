package com.company.examples.m_2_4.io.sample2;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileFilter implements FilenameFilter {
    private String ext;

    public MyFileFilter(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
