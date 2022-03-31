package ru.job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThen0() {
        Fact.calc(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenNLess0() {
        Fact.calc(-10);
    }
}