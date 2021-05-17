package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromFiveToTenTwentyFour() {
        int start = 5;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 24;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromFourToSixteenSevenThousandSixteen() {
        int start = 4;
        int finish = 16;
        int result = Counter.sumByEven(start, finish);
        int expected = 70;
        Assert.assertEquals(expected, result);
    }
}