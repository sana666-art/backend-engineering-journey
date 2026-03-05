package com.vinncorp;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {

        Integer[] Numbers = {12, 34, 9, 6, 5, 3, 2, 13, 12, 3, 15};
//        printAllNumbersInListSturctured(List.of(Numbers));
//        printEvenNumbersInListSturctured(List.of(Numbers));
        printOddNumbersInListSturctured(List.of(Numbers));

    }

//    Structured Approch
    private static void printAllNumbersInListSturctured(List<Integer> integers) {

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    private static void printEvenNumbersInListSturctured(List<Integer> integers) {

        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
    }

    private static void printOddNumbersInListSturctured(List<Integer> integers) {

        for (Integer integer : integers) {
            if (integer % 2 != 0) {
                System.out.println(integer);
            }
        }
    }
}
