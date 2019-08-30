package com.company.homework.m2_9.task1_2;

/*1. Вывести на экран все ссылки, которые содержатся в скачаном HTML документе(+)
* 2. Скачать все HTML файлы, доступные по ссылкам в отдельный каталог(+).*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class MainT1M29 {
    public static void main(String[] args) {
        String address = "https://prog.kiev.ua";
        String dir = "D:\\my_files\\java\\java oop\\files for test\\T1M29";
        List<String> links = new ArrayList<>();

        //парсим испальзую библиотеку Jsoup
        Document document = Jsoup.parse(loadHtml(address));
        Elements list = document.getElementsByTag("a");

        for (Element element : list) {
            String res = element.attr("href");
            if (res.contains("http")) {
                System.out.println(res);
                links.add(res);
            }
        }

        saveHtml(links, dir);
    }

    //получаем html в стринг
    private static String loadHtml(String address) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(address);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            try{
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                char[] buff = new char[1024];
                int r;

                do {
                    if ((r = reader.read(buff)) > 0)
                        sb.append(new String(buff, 0, r));
                }while (r > 0);

                return sb.toString();
            }finally {
                connection.disconnect();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }


    //сохраняем в файлы
    private static void saveHtml(List<String> links, String dir) {
        if (links.size() > 0) {
            int count = 0;
            for (String s : links) {
                File file = new File(dir + "\\" + count++ + ".html");
                try(FileOutputStream fos = new FileOutputStream(file)) {

                    fos.write(loadHtml(s).getBytes());

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
