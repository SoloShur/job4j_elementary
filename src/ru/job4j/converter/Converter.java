package ru.job4j.converter;

public class Converter {
    public static float rubToEuro(float value) {
        return value / 70;
    }

    public static float rubToUsd(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rub are 2. Test result: " + passed);
        out = Converter.rubToUsd(in);
        System.out.println("140 rub are 2.3. Test result: " + passed);

    }
}
