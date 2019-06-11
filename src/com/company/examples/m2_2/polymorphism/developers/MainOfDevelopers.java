package com.company.examples.m2_2.polymorphism.developers;

public class MainOfDevelopers {
    public static void main(String[] args) {
        Developer[] developers = {
                new JuniorDeveloper("Mike", 500, 0),
                new JuniorDeveloper("Dima", 500, 1),
                new JuniorDeveloper("Vova", 500, 2),
                new SeniorDeveloper("Jack", 500, 5),
                new TeamLeadDeveloper("Robby", 500, 7)
        };

        StringBuilder sb;

        for (Developer d : developers) {
            sb = new StringBuilder()
                    .append(d.getName())
                    .append(": ")
                    .append(d.basicSalary)
                    .append(" -> ")
                    .append(d.getSalary());

            System.out.println(sb.toString());
        }

        //использование instanceof
//        Developer d = new JuniorDeveloper("Mike", 500, 1);
        Developer d = new SeniorDeveloper("Mike", 500, 1);
        if (d instanceof JuniorDeveloper)
            System.out.println("Junior");
        else if (d instanceof SeniorDeveloper)
            System.out.println("Senior");
    }
}
