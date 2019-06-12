package com.company.homework.m2_3.task1;

public class UrlParser {

    public void parsUrl(String url) throws FormatException {
        String[] arr = url.split("&");

        for (int i = 0; i < arr.length; i++) {
            String[] temp = arr[i].trim().split("=");

            if (temp.length != 2 || temp[0].length() == 0 || temp[1].length() == 0)
                throw new FormatException("wrong format in \"" + arr[i] + "\"");

            System.out.println(temp[0] + " : " + temp[1]);
        }
    }
}
