package com.company.examples.m2_3.exceptions.sample1;

public class Rectangle {
    private int width;
    private int height;

    public void setWidth(int width) throws WidthException {
        if (width < 0)
            throw new WidthException("wrong width");
        this.width = width;
    }

    public void setHeight(int height) throws HeightException{
        if (height < 0)
            throw new HeightException("wrong height");
        this.height = height;
    }
}
