package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.minSales(sales));
        System.out.println(service.maxSales(sales));
        System.out.println(service.sumOfSales(sales));
        System.out.println(service.averageAmount(sales));
        System.out.println(service.higherThanAverage(sales));
        System.out.println(service.lowerThanAverage(sales));
    }
}