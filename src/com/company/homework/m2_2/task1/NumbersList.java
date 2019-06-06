package com.company.homework.m2_2.task1;

public class NumbersList {
    private Phone[] list = new Phone[100];
    private int p = 0;


    public void add(Phone phone) {
        if (this.p >= list.length) {
            Phone[] swap = list.clone();
            list = new Phone[list.length + 100];
            System.arraycopy(swap, 0, list, 0, swap.length);
            list[this.p++] = phone;
        }else {
            list[this.p++] = phone;
        }
    }

    public Phone get(int n) {
        return list[n];
    }


    public int findByNumber(int number) {
        for (int i = 0; i < p; i++) {
            if (list[i].getNumber() == number)
                return i;
        }

        return -1;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < p; i++) {
            sb.append(list[i].getNumber()).append("\n");
        }
        return sb.toString();
    }
}
