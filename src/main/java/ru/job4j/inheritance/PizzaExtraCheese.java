package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String NAME = "EXTRA CHEESE";

    @Override
    public String name() {
        return NAME + " " + super.name();
    }
}
