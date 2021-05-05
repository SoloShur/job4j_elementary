package ru.job4j.converter;

public class Converter {
    public static float rubToEuro(float value) {
        return value / 70;
    }

    public static float rubToUsd(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubToEuro(526);
        float usd = Converter.rubToUsd(325);
        System.out.println(euro);
        System.out.println(usd);

    }
}
