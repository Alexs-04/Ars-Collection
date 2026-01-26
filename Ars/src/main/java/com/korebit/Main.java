package com.korebit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

        Arrays.stream(fruits).filter(fruit -> fruit.contains("erry"))
                .forEach(System.out::println);

        Arrays.stream(fruits).map(String::toUpperCase)
                .forEach(System.out::println);
    }
}