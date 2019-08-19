package com.company.examples.m2_5.threads.sample6;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        String out = "D:\\my_files\\java\\java oop\\files for test\\out.txt";
        String in = "D:\\my_files\\java\\java oop\\files for test\\in.txt";

        Processor processor = new Processor(data ,out);
        processor.start();

        Preparator preparator = new Preparator(data, in);
        preparator.start();
    }
}
