package com.company.homework.m2_2.task1;

/*1. Написать класс наследник SamsungS4 с диагональю экрана 5 дюймов, поддержкой Wifi и методом отправки SMS, который
*    будет дописывать к сообщению слово "Hello"(+)
* 2. Модифицировать класс Phone так, чтобы он считал количество звонков и сообщений отдельно для каждого объекта(+)*/

public class MainOfPhones {
    public static void main(String[] args) {
        //Phone phone = new Phone(); ошибка т.к. класс абстрактный

        Nokia3310 nokia3310 = new Nokia3310();
        System.out.println("Nolia3310 screen size: " + nokia3310.getScreenSize());
        nokia3310.call("123-45-67");
        nokia3310.sendSMS("567-89-10", "text message");
        System.out.println("--------------------------------------------");


        IPhone iPhone = new IPhone();
        System.out.println("IPhone screen size: " + iPhone.getScreenSize());
        iPhone.call("133-45-67");
        iPhone.sendSMS("133-45-67", "texm message");
        System.out.println("---------------------------------------------");


        IPhone5 iPhone5 = new IPhone5();
        System.out.println("IPhone5 screen size: " + iPhone5.getScreenSize());
        iPhone5.call("123-45-67");
        iPhone5.sendSMS("123-45-67", "text message");


        System.out.println("----------------------------------------------");
        SamsungS4 samsungS4 = new SamsungS4();
        System.out.println("SamsungS4 screen size: " + samsungS4.getScreenSize());
        samsungS4.call("123-456-77");
        samsungS4.sendSMS("123-45-67", "text message");

        //звоним и отправляем смс для тестирования счетчиков
        for (int i = 0; i < 50; i++) {
            if (i < 5) {
                nokia3310.call("1111");
                nokia3310.sendSMS("1111", "blah blah");
            }else if (i > 5 && i < 15) {
                iPhone5.call("22222");
                iPhone5.sendSMS("2222", "bjksdfk");
            }else if (i > 15 && i < 50) {
                samsungS4.call("33333");
                samsungS4.sendSMS("3333", "fkjdshfkjdsk");
            }
        }

        System.out.println("Nokia3310 counts: " + "calls: " + nokia3310.getCountOfCalls() + " sms: " + nokia3310.getCoutnOfSms());
        System.out.println("IPhone5 counts: " + "calls: " + iPhone5.getCountOfCalls() + " sms: " + iPhone5.getCoutnOfSms());
        System.out.println("SamsungS4 counts: " + "calls: " + samsungS4.getCountOfCalls() + " sms: " + samsungS4.getCoutnOfSms());

    }
}
