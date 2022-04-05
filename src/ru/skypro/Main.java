package ru.skypro;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №1");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n_____");

        System.out.println("Задание №2");
        int fridayDate = 3;
        for (; fridayDate <= 31; fridayDate = fridayDate + 7) {
            System.out.println("Сегодня пятница, " + fridayDate + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("_____");

        System.out.println("Задание №3");
        int currentYear = 2022;
        int cometPeriod = 79;
        int trackingPeriodStart = currentYear - 200;
        int trackingPeriodStop = currentYear + 100;

        for (int j = 0; j <= trackingPeriodStop; j += cometPeriod) {
            if (j >= trackingPeriodStart) {
                System.out.println(j);
            }
        }
        System.out.println("_____");
    }
}
