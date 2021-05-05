package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RubThen3Usd() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubToUsd(in);
        Assert.assertEquals(expected, out);
    }
}