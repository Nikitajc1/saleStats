package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int sumOfSales(int[] sales) {

        int result = sales[0];
        for (int i = 1; i < sales.length; i++){
            result = result + sales[i];
        }
        return result;
    }

    public int averageAmount(int[] sales) {
        int avg = sumOfSales(sales) / sales.length;
        return avg;
    }

    public int higherThanAverage(int[] sales) {

        int numberOfMonth = 0;
        for (int sale : sales) {
            if (sale > averageAmount(sales)) {
                numberOfMonth = numberOfMonth + 1;
            }
        } return numberOfMonth;
    }

    public int lowerThanAverage(int[] sales) {

        int numberOfMonth = 0;
        for (int sale : sales) {
            if (sale < averageAmount(sales)) {
                numberOfMonth = numberOfMonth + 1;
            }
        } return numberOfMonth;
    }
}
