package com.company.homework.m2_3.task3;

import com.company.homework.m2_3.task1.FormatException;

public class MyInteger {

    static int parseInt(String s) throws FormatException {
        boolean isNegative = false; //флаг для отрицательного числа. Если true значение негативное
        int result = 0; //если все ОК, в этой переменной будет результат
        int i = 0;//переменная для цикла. Нужна для того, что бы если первый символ минус, цикл стартовал не с 0, а с 1

        //если приходит null или длинна строки 0, бросаем исключение
        if(s == null || s.length() == 0)
            throw new FormatException("value can't be NULL or length == 0");

        //если первый символ 0, меняем флаг на true и счетчик для цикла меняем на 1
        if (s.charAt(0) == '-') {
            isNegative = true;
            i = 1;
        }

        //разбиваем строку на массив символов
        char[] arr = s.toCharArray();

        /*Проходим по массиву символов и от каждого символа отнимаеи 48 или символ '0'(нужно для упрощения подсчета.
         цифры в таблице ASCII начинаются с 48)
        если после отнимания символ меньше или равно 10 и больше 0, тогда результат
        умножаем на 10 и добавляем к нему значение из массива*/
        for (; i < arr.length; i++) {
            if(arr[i] - '0' <= 10 && arr[i] - '0' > 0){
                result *= 10;
                result += arr[i] - '0';
            }else {
                throw new FormatException("wrong character: " + arr[i]);
            }
        }

        //тут все ясно и так
        if (isNegative)
            result = -result;

        return result;


    }
}
