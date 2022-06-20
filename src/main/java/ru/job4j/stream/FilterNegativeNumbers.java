package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-3896, -1, -2, 0, 100, 200, 300);
        List<Integer> positive = numbers.stream().filter(
                number -> number > 0
        ).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
