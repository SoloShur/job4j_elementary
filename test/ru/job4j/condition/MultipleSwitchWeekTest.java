package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMonThen1A() {
        String in = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMonThen1B() {
        String in = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}