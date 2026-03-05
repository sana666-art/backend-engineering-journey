package com.vinncorp;

import java.util.ArrayList;
import java.util.List;

public class FP01Excerises {

    private static void printOddNumbersInListFunctional(List<Integer> integers) {

        integers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println);

    }

    public static void main(String[] args) {

        List<Integer> integers = List.of(12, 34, 9, 6, 5, 3, 2, 13, 12, 3, 15);

        printOddNumbersInListFunctional(integers);


        List<String> courses = List.of("Java", "Spring","AWS","Python", "C#", "C++", "Ruby", "JavaScript", "SpringBoot", "APIs");

        courses.stream().forEach(System.out::println);

        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);

        courses.stream()
                .filter(course -> course.length()>=4)
                .forEach(System.out::println);

        courses.stream()
                .map(course -> course.length())
                .forEach(System.out::println);

    }

}
