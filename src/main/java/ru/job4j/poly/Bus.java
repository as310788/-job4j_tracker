package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Марка");
    }

    @Override
    public void passengers(int unit) {
        System.out.println("Число пассажиров" + " " + unit);
    }

    @Override
    public double oil(double galon, double price) {
        return galon * price;
    }
}