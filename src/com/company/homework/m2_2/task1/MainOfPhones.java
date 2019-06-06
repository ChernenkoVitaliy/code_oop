package com.company.homework.m2_2.task1;

/*1. Написать класс наследник SamsungS4 с диагональю экрана 5 дюймов, поддержкой Wifi и методом отправки SMS, который
*    будет дописывать к сообщению слово "Hello"(+)
* 2. Модифицировать класс Phone так, чтобы он считал количество звонков и сообщений отдельно для каждого объекта(+)
* 3. Написать код для связи телефонов между собой. У каждого телефона будет свой номер. При вызове call(x) телефон должен
*    найти собеседника по номеру X из всех доступных в данный момент телефонов (из всех созданных объектов типа Phone) и
*    вызвать его метод answer().*/

public class MainOfPhones {
    public static void main(String[] args) {
        //создаем лист где будут регистрироватся активные номера
        final NumbersList list = new NumbersList();

        //создаем несколько телефонов с номерами
        Nokia3310 nokia3310 = new Nokia3310( 1234, list);
        IPhone iPhone = new IPhone( 12345, list);
        IPhone5 iPhone5 = new IPhone5(4321, list);
        SamsungS4 samsungS4 = new SamsungS4(54321, list);



        //звоним. Если номер зарегестрирован вызываем метод answer()
        nokia3310.call(12345);
        System.out.println();
        iPhone5.call(54321);
        System.out.println();
        iPhone.call(8554464);




        //звоним и отправляем смс для тестирования счетчиков
        for (int i = 0; i < 50; i++) {
            if (i < 5) {
                nokia3310.call(1111);
                nokia3310.sendSMS("1111", "blah blah");
            }else if (i > 5 && i < 15) {
                iPhone5.call(22222);
                iPhone5.sendSMS("2222", "bjksdfk");
            }else if (i > 15 && i < 50) {
                samsungS4.call(33333);
                samsungS4.sendSMS("3333", "fkjdshfkjdsk");
            }
        }

        System.out.println("Nokia3310 counts: " + "calls: " + nokia3310.getCountOfCalls() + " sms: " + nokia3310.getCoutnOfSms());
        System.out.println("IPhone5 counts: " + "calls: " + iPhone5.getCountOfCalls() + " sms: " + iPhone5.getCoutnOfSms());
        System.out.println("SamsungS4 counts: " + "calls: " + samsungS4.getCountOfCalls() + " sms: " + samsungS4.getCoutnOfSms());

    }
}
