package com.company.examples.m_2_5.threads.sample2;

import java.math.BigInteger;

public class Task extends Thread{
    private IFinish finish;
    private BigInteger n;

    public Task(BigInteger n, IFinish finish) {
        this.n = n;
        this.finish = finish;
    }

    private BigInteger fact(BigInteger x) {
        if (x.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else
            return x.multiply(fact(x.subtract(BigInteger.ONE)));
    }

    @Override
    public void run() {
        BigInteger res = fact(n);
        if (finish != null)
            finish.done(res);
    }
}
