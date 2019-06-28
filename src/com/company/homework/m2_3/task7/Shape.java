package com.company.homework.m2_3.task7;

public abstract class Shape implements Comparable{
    protected double s;//площадь
    protected String name;

    @Override
    public int compareTo(Object o) {
        Shape shape = (Shape) o;
        if (this.getS() < shape.getS())
            return -1;
        else if (this.getS() == shape.getS())
            return 0;
        else if (this.getS() > shape.getS())
            return 1;
        else
            return 0;
    }

    public abstract double getS();

    public String getName() {
        return name;
    }
}
