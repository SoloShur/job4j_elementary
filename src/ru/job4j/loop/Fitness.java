package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int mount = 0;
        while (ivan <= nik) {
            ivan = ivan * 3;
            nik = nik * 2;
            mount++;
        }
        return mount;
    }
}
