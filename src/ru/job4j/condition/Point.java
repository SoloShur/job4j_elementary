package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double powX = Math.pow(x, 2);
        double powY = Math.pow(y, 2);
        double sumXY = powX + powY;
        return Math.sqrt(sumXY);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
