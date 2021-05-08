package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To10Then10() {
        int left = 10;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax23To23Then23() {
        int left = 23;
        int right = 23;
        int result = Max.max(left, right);
        int expected = 23;
        Assert.assertEquals(result, expected);
    }
}