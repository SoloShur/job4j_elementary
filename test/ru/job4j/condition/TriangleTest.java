package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 3;
        double ac = 3;
        double bc = 3;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 35;
        double ac = 5;
        double bc = 4;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}