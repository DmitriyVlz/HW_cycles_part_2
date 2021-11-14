package ru.netology.stats;

public class StatsService {
    // ####сумма продаж
    public int calculSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // #####средние продажи
    public int findMidlSales(int[] sales) {
        int midl = 0;
        midl = calculSum(sales) / sales.length;
        return midl;
    }
    // #####Номер месяца  с максимумом продаж

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        int month = 0;

        for (int sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // #####Номер месяца с минимумом продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {     // sales[minMonth] - продажи в месяце minMonth   // sale - продажи в рассматриваемом месяце

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // ##### кол-во мес. в  которых продажи ниже среднего
    public int monthLowAverageSales(int[] sales) {
        int midlMonth = 0;// счётчик мес с продажами ниже среднего
        for (int sale : sales) {             // sales- продажи в месяце // sale - продажи в рассматриваемом месяце
            if (sale < (calculSum(sales) / sales.length)) {     // среднее значение продаж по году
                midlMonth++;
            }
        }
        return midlMonth;
    }

    // #### кол-во мес, в которых продажи выше среднего
    public int monthHighAverageSales(int[] sales) {
        int midlHiMonth = 0;// счётчик мес с продажами ниже среднего
        for (int sale : sales) {             // sales- продажи в месяце // sale - продажи в рассматриваемом месяце
            if (sale > (calculSum(sales) / sales.length)) {     // среднее значение продаж по году
                midlHiMonth++;
            }
        }
        return midlHiMonth;
    }

}




