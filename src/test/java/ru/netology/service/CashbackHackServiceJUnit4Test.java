package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceJUnit4Test {

    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100ForAmount900() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500ForAmount2500() {
        int amount = 2500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0ForAmount1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        // Этот тест УПАДЕТ
        Assert.assertEquals(expected, actual);
    }
}