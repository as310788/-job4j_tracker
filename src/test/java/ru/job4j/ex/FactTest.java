package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThen0() {
        Fact.calc(-1);
    }

    @Test
    public void when3Then6() {
        int rsl = Fact.calc(3);
        assertThat(rsl, is(6));
    }
}