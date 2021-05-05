package ru.job4j.converter;

public class Converter {
    public static int rubToEuro(int value) {
        return value / 70;
    }

    public static int rubToUsd(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rub are 2. Test result: " + passed);
        out = Converter.rubToUsd(in);
        System.out.println("140 rub are 2.3. Test result: " + passed);

    }
}
