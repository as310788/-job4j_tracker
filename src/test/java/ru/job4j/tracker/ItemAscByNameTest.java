package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemAscByNameTest {

    @Test
    public void whenSortByNameItemAToZ() {
        List<Item> items = Arrays.asList(
                new Item(2, "Petr"),
                new Item(3, "Ivan"),
                new Item(1, "Alex")
        );
        Collections.sort(items, new ItemAscByName());
        assertThat(items.get(0).getName(), is("Alex"));
    }
}