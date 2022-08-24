public class StatsService {

    public long sum(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
            
        }

        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
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

    public int belowAverage(long[] sales) {
        long ave = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < ave) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverage(long[] sales) {
        long ave = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > ave) {
                count++;
            }
        }
        return count;
    }

}
