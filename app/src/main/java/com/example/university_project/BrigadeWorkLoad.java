package com.example.university_project;

import java.util.Scanner;

public class BrigadeWorkLoad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Расчёт средней загруженности бригады ===");

        System.out.print("Введите общий объём работ (в часах): ");
        double totalHours = input.nextDouble();

        System.out.print("Введите количество рабочих в бригаде: ");
        int workersCount = input.nextInt();

        if (workersCount <= 0) {
            System.out.println("Ошибка: Количество рабочих должно быть больше нуля.");
        } else {
            double averageLoad = totalHours / workersCount;

            System.out.println("--------------------------------------------");
            System.out.printf("Средняя загруженность на одного человека: %.2f часов\n", averageLoad);
        }

        input.close();
        



        // test message for commit
    }
}
