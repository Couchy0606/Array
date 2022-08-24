import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actualSum = service.sum(sales);
        long expectedSum = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(actualSum, expectedSum);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actualAverage = service.sum(sales) / 12;
        long expectedAverage = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(actualAverage, expectedAverage);
    }

    @Test
    public void testMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.maxSales(sales);
        long expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.minSales(sales);
        long expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void belowAverage() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.belowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void aboveAverage() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.aboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(actual, expected);
    }
}
