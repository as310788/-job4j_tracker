package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemDescByNameTest {

    @Test
    public void whenSortByNameItemZToA() {
        List<Item> items = Arrays.asList(
                new Item("Ivan"),
                new Item("Petr"),
                new Item("Alex")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("Petr"),
                new Item("Ivan"),
                new Item("Alex")
        );
        Assert.assertEquals(items, expected);
    }
}