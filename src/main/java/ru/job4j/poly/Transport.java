package ru.job4j.poly;

public interface Transport {
    void drive();

    void passengers(int unit);

    double oil(double galon, double price);
}
