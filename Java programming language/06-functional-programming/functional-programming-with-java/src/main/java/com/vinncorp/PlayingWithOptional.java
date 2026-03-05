package com.vinncorp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Mongo");
        fruits.add("Peach");

        Predicate<? super String> predicate =fruit -> fruit.startsWith("b");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.get());
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());

    }
}
