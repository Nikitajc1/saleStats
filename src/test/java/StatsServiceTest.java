import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();

        int expected = 9;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales( sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();

        int expected = 8;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumOfSalesTest() {
        StatsService service = new StatsService();

        int expected = 180;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sumOfSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageAmountTest() {
        StatsService service = new StatsService();

        int expected = 15;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void higherThanAverageTest() {
        StatsService service = new StatsService();

        int expected = 5;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.higherThanAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerThanAverageTest() {
        StatsService service = new StatsService();

        int expected = 5;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.lowerThanAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
