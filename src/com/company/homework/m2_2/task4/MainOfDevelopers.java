package com.company.homework.m2_2.task4;

/*1. Написать своег наследника Developer. Добавить его в существующий проект.(+)
* 2. Создать список разработчиков и заполнить его случайным образом. Вывести на экран только Senior developer-ов
*    с зарплатой больше 1500 y.e(+)
* 3. Написать код, который разделит список объектов Developer на 3 отдельных списка для Junior, Seniors и Team Leads.
*    Вывести списки на экран(+)*/

import java.util.Random;


public class MainOfDevelopers {
    public static void main(String[] args) {
        Developer[] developers = new Developer[100];

        //заполняем рандомно массив developer-ов(задача2)
        Random random = new Random();
        int n = 4; //диапазон для random;
        String[] names = {"Nick", "Boris", "John", "Artem", "Den"}; //список имен для рандомного заполнения

        for (int i = 0; i < developers.length; i++) {
            int r = random.nextInt(n);
            if(r == 0) {
                developers[i] = new JuniorDeveloper(names[random.nextInt(4)], 500, random.nextInt(5));
            }else if (r == 1) {
                developers[i] = new MidleDeveloper(names[random.nextInt(4)], 500, random.nextInt(5));
            }else if (r == 2) {
                developers[i] = new SeniorDeveloper(names[random.nextInt(4)], 600, random.nextInt(10));
            }else if (r == 3) {
                developers[i] = new TeamLeadDeveloper(names[random.nextInt(4)], 500, random.nextInt(5));
            }
        }
        for (Developer d : developers) {
            StringBuilder sb;

            if(d instanceof SeniorDeveloper && d.getSalary() > 1500) {
                sb = new StringBuilder()
                        .append(d.getName())
                        .append(": ")
                        .append(d.getBasicSalary())
                        .append(" => ")
                        .append(d.getSalary());

                System.out.println(sb.toString());
            }
        }



        //задача3. Разделяем на 3 списка
        int jd = 0, sd = 0, tld = 0; //длинны массивов

        for (int i = 0; i < developers.length; i++) {
            if (developers[i] instanceof JuniorDeveloper)
                jd++;
            else if (developers[i] instanceof SeniorDeveloper)
                sd++;
            else if (developers[i] instanceof TeamLeadDeveloper)
                tld++;
        }

        JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[jd];
        SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[sd];
        TeamLeadDeveloper[] teamLeadDevelopers = new TeamLeadDeveloper[tld];
        //как вариант можно создать массивы длинной с общий массив, а затем просто обрезать
        //и в первом цикле вместо jd++ написать juniorDevelopers[jd++] = (JuniorDeveloper) developers[i];
        //тогда не нужно будет проходить 2 раза циклом. В плане производительности не засекал
        //Пример: juniorDevelopers = Arrays.copyOf(juniorDevelopers, jd);

        jd = 0;
        sd = 0;
        tld = 0;

        for (int i = 0; i < developers.length; i++) {
            if (developers[i] instanceof JuniorDeveloper)
                juniorDevelopers[jd++] = (JuniorDeveloper) developers[i];
            else if (developers[i] instanceof SeniorDeveloper)
                seniorDevelopers[sd++] = (SeniorDeveloper) developers[i];
            else if (developers[i] instanceof TeamLeadDeveloper)
                teamLeadDevelopers[tld++] = (TeamLeadDeveloper) developers[i];
        }


        System.out.println("\nJunior Developers");
        for (JuniorDeveloper d : juniorDevelopers) {
            StringBuilder sb;
                sb = new StringBuilder()
                        .append(d.getName())
                        .append(": ")
                        .append(d.getBasicSalary())
                        .append(" => ")
                        .append(d.getSalary());

                System.out.println(sb.toString());

        }

        System.out.println("\nSenior Developers");
        for (SeniorDeveloper d : seniorDevelopers) {
            StringBuilder sb;
            sb = new StringBuilder()
                    .append(d.getName())
                    .append(": ")
                    .append(d.getBasicSalary())
                    .append(" => ")
                    .append(d.getSalary());

            System.out.println(sb.toString());

        }

        System.out.println("\nTeam lead Developers");
        for (TeamLeadDeveloper d : teamLeadDevelopers) {
            StringBuilder sb;
            sb = new StringBuilder()
                    .append(d.getName())
                    .append(": ")
                    .append(d.getBasicSalary())
                    .append(" => ")
                    .append(d.getSalary());

            System.out.println(sb.toString());

        }
    }
}
