package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sumSales = 0;
        for (long i : sales) {
            sumSales = sumSales + i;
        }
        return sumSales;
    }

    public long averSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minAmountMonthSales(long[] sales) {
        int amount = 0;
        long averSales = averSales(sales);
        for (long sale : sales) {
            if (sale < averSales) {
                amount = amount + 1;
            }
        }
        return amount;
    }

    public int maxAmountMonthSales(long[] sales) {
        int amount = 0;
        long averSales = averSales(sales);
        for (long sale : sales) {
            if (sale > averSales) {
                amount = amount + 1;
            }
        }
        return amount;
    }
}
