package com.vinncorp;

import java.util.List;

public class FP01Functional {

    private static void print(int integer){
        System.out.println(integer);
    }

    private static void printAllNumbersInListFunctional(List<Integer> integers) {
        //converting list into stream
        //what to do
        integers.stream()
                .forEach(System.out::println);
//                .forEach(FP01Functional::print);//method Reference

    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    private static void printEvenNumbersInListFunctional(List<Integer> integers) {

        integers.stream()
//                .filter(FP01Functional::isEven).forEach(System.out::println);
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println); //lamda Expression

    }

    private static void printOddNumbersInListFunctional(List<Integer> integers) {

        integers.stream()
//                .filter(FP01Functional::isOdd).forEach(System.out::println);
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println); //lambda Expression

    }

    private static void printSquaresofEvenNumbersInListFunctional(List<Integer> integers) {

        integers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println); //lambda Expression

    }

    private static void printCubesOfOddNumbersInListFunctional(List<Integer> integers) {

        integers.stream()
                .filter(number -> number % 2 ==1)
                .map(number -> number * number * number)
                .forEach(System.out::println);

    }

    public static void main(String[] args) {

        Integer[] integers = {12, 34, 9, 6, 5, 3, 2, 13, 12, 3, 15};

//        printAllNumbersInListFunctional(List.of(integers));
//        printEvenNumbersInListFunctional(List.of(integers));
//        printOddNumbersInListFunctional(List.of(integers));
//        printSquaresofEvenNumbersInListFunctional(List.of(integers));
//        printCubesOfOddNumbersInListFunctional(List.of(integers));

    }

}
