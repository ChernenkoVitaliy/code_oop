package com.company.homework.m2_7.task3;

public class Container <E> {
    private E value;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public E getForIndex(E[] arr, int index) {
        return arr[index];
    }
}
