package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void positiveCashbackService() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void zeroCashbackService() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void negativeCashbackService() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }
}
