package ru.job4j.converter;

public class Converter {
    public static float rubToEuro(float value) {
        float rsl = value/70;
        return rsl;
    }

    public static float rubToUsd(float value) {
        float rsl = value/60;
        return rsl;
    }

    public static void main(String[] args){
        float euro = Converter.rubToEuro(526);
        float usd = Converter.rubToUsd(325);
        System.out.println(euro);
        System.out.println(usd);

    }
}
