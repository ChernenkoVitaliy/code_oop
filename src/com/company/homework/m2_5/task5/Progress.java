package com.company.homework.m2_5.task5;

public class Progress implements IProgress {
    private long n = 0;

    @Override
    public void update(double p) {
        final long rounded = Math.round(p);
        long add = rounded - n;
        n = rounded;

        while (add-- > 0)
            System.out.print(".");
    }
}
