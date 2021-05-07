package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

    public class MathCalculator {

        public static double sumAndMultiply(double first, double second) {
            return sum(first, second)
                    + multiply(first, second);
}

    public static double differenceAndDiv(double first, double second) {
            return difference(first, second)
                    + div(first, second);
    }

    public static double sumAllOperations(double first, double second) {
            return sum(first, second)
                    + multiply(first, second)
                    + difference(first, second)
                    + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат суммы разности и деления: " + differenceAndDiv(35, 5));
        System.out.println("Результат суммы всех арифметических операций: " + sumAllOperations(84, 9));
    }
}

