import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatsServiceTest {
    @Test
    void shouldSumSales() {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        long expected = 181;
        long actual = service.sumSales(stats);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverSales() {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averSales(stats);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinMonthSales() {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minMonthSales(stats);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxMonthSales() {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxMonthSales(stats);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinAmountMonthSales() {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.minAmountMonthSales(stats);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxAmountMonthSales() {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.maxAmountMonthSales(stats);
        assertEquals(expected, actual);
    }
}
