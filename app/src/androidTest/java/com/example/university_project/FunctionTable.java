package com.example.university_project;

public class FunctionTable {
    public static void main(String[] args) {
        double start = 0.0;
        double end = 3.0;
        double step = 0.1;

        System.out.println("-------------------------");
        System.out.print("|   x   |      F(x)     |\n");
        System.out.println("-------------------------");

        for (double x = start; x <= end + (step / 2); x += step) {


            double fx = Math.exp(x) - Math.exp(-x) * Math.sin(2 * Math.pow(x, 2) * Math.pow(x, 3));

            System.out.printf("|  %.1f  |  %12.4f |\n", x, fx);
        }
        System.out.println("-------------------------");
    }
}