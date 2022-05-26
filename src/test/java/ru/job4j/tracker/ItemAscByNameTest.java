package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemAscByNameTest {

    @Test
    public void whenSortByNameItemAToZ() {
        List<Item> items = Arrays.asList(
                new Item("Petr", 2),
                new Item("Ivan", 3),
                new Item("Alex", 1)
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Alex", 1),
                new Item("Ivan", 3),
                new Item("Petr", 2)
        );
        Assert.assertEquals(items, expected);
    }
}