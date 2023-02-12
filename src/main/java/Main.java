import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(Arrays.toString(stats));
        System.out.println("Сумма = " + service.sumSales(stats));
        System.out.println("Среднее = " + service.averSales(stats));
        System.out.println("День минимума = " + service.minMonthSales(stats));
        System.out.println("День максимума = " + service.maxMonthSales(stats));
        System.out.println("Меньше среднего = " + service.minAmountMonthSales(stats));
        System.out.println("Больше среднего = " + service.maxAmountMonthSales(stats));
    }
}
