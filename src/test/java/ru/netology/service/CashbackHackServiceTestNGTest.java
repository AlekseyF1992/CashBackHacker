package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTestNGTest {

    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100ForAmount900() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500ForAmount2500() {
        int amount = 2500;
        int actual = service.remain(amount);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0ForAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        //Этот тест УПАДЕТ, так как сервис вернет 1000
        Assert.assertEquals(actual, expected);
    }
}