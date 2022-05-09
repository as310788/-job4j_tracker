package ru.job4j.inheritance;

public class PizzaExtraCheesaExtraTomato extends PizzaExtraCheese {
    private static final String NAME = "EXTRA TOMATO";

    @Override
    public String name() {
        return NAME + " " + super.name();
    }
}
