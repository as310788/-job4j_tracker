package ru.job4j.poly;

public interface Transport {
    String drive();
    int passengers(int unit);
    double oil(double galon, double price);
}
