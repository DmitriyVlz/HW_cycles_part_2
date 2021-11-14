package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldcalculSum() {
        StatsService service = new StatsService();

        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculSum(monthSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldfindMidlSales() {
        StatsService service = new StatsService();

        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findMidlSales(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldmaxSales() {
        StatsService service = new StatsService();
        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        int actual = service.maxSales(monthSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldmonthLowAverageSales() {
        StatsService service = new StatsService();
        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthLowAverageSales(monthSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldmonthHighAverageSales() {
        StatsService service = new StatsService();
        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthLowAverageSales(monthSales);
        assertEquals(expected, actual);
    }


    @Test
    void shouldminSales() {
        StatsService service = new StatsService();

        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(monthSales);
        assertEquals(expected, actual);
    }


}



