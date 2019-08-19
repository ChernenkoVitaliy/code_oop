package com.company.examples.m2_5.threads.sample2;

import java.math.BigInteger;

public class Finish implements IFinish {
    @Override
    public void done(BigInteger result) {
        System.out.println(result);
    }
}
