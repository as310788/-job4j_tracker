package ru.job4j.stream;


import java.time.LocalDate;

public class Car {

    private String brand;

    private String model;

    private LocalDate created;

    private double volume;

    private String color;

    private String speed;

    private int exit;

    public String toString() {

        return "Car{"
                + "brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", created='" + created + '\''
                + ", volume='" + volume + '\''
                + ", color='" + color + '\''
                + ", speed='" + speed + '\''
                + ", exit='" + exit + '\''
                + '}';
    }

    static class Builder {
        private String speed;
        private String brand;
        private String model;
        private LocalDate created;
        private double volume;
        private String color;
        private int exit;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        Builder buildVolume(double volume) {
            this.volume = volume;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildSpeed(String speed) {
            this.speed = speed;
            return this;
        }

        Builder buildExit(int exit) {
            this.exit = exit;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.color = color;
            car.created = created;
            car.model = model;
            car.volume = volume;
            car.speed = speed;
            car.exit = exit;
            return car;
        }
    }

    public static void main(String[] args) {
        Car car = new Builder()
                .buildBrand("Toyota")
                .buildModel("CAMRY")
                .buildCreated(LocalDate.of(2021, 6, 1))
                .buildVolume(2.5)
                .buildColor("Red")
                .buildSpeed("200 Km/ч")
                .buildExit(2008)
                .build();
        System.out.println(car);
    }
}
