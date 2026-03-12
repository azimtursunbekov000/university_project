package com.example.university_project;

import java.util.Scanner;

public class TrianglePerimeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("--- Ввод координат для треугольника №" + i + " ---");

            System.out.print("Вершина A (x1 y1): ");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();

            System.out.print("Вершина B (x2 y2): ");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            System.out.print("Вершина C (x3 y3): ");
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();

            double perimeter = calculateTrianglePerimeter(x1, y1, x2, y2, x3, y3);
            System.out.printf("Периметр треугольника №%d: %.4f\n\n", i, perimeter);
        }

        scanner.close();
    }

    /**
     * Метод для вычисления расстояния между двумя точками (x1, y1) и (x2, y2)
     */
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Метод для вычисления периметра треугольника по координатам его вершин
     */
    public static double calculateTrianglePerimeter(double x1, double y1, double x2, double y2, double x3, double y3) {
        double sideAB = getDistance(x1, y1, x2, y2);
        double sideBC = getDistance(x2, y2, x3, y3);
        double sideCA = getDistance(x3, y3, x1, y1);

        return sideAB + sideBC + sideCA;
    }
}