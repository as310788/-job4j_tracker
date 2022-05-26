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
                new Item("Petr"),
                new Item("Ivan"),
                new Item("Alex")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Alex"),
                new Item("Ivan"),
                new Item("Petr")
        );
        Assert.assertEquals(items, expected);
    }
}