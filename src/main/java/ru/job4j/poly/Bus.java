package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public String drive() {
        return null;
    }

    @Override
    public int passengers(int unit) {
        System.out.println(unit);
        return 0;
    }

    @Override
    public double oil(double galon, double price) {
        return galon * price;

    }
}
