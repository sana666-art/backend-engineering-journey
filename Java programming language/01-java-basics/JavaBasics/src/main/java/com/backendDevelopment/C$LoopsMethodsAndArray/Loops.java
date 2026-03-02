package com.backendDevelopment.C$LoopsMethodsAndArray;

import java.util.Scanner;

public class Loops {

    public class StarPatterns {
        public static void main(String[] args) {

            int n = 5;

            for (int i = 1; i <= n; i++) {          // rows
                for (int j = 1; j <= n; j++) {      // columns
                    System.out.print("* ");
                }
                System.out.println();               // new line
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int n=6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

//        Normal pyramid
//        Inverted pyramid
//
//        Upper half:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }

//        Lower half:
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }

//        for (int row = 1; row <= n; row++) {
//
//            for (int col = 1; col <= n; col++) {
//
//                if (condition_based_on_row_and_col) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//
//            System.out.println();
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        int num = 1; // initialization
        while (num <= 10) { // condition
            System.out.println(num); // actual work
            num = num + 1; // updating the condition
        }

        int count = 500;
        while (count >= 200) {
            System.out.println(count);
            count -= 1;
        }

        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            int inp = input.nextInt();
            System.out.println("Number is: " + inp);
            i++;
        }

        int num1 = 1;
        do {
            System.out.println(num1);
            num1++;
        } while (num1 <= 5);

        int[] numbers = {1, 2, 3, 4};
        for (int num2 : numbers) {
            System.out.println(num2);
        }

        for (int k = 0; k < 10; k++) {
            if (k == 5) break;
        }

        for (int j = 0; j < 5; j++) {
            if (j == 2) continue;
            System.out.println(i);
        }

        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
            }
        }

//        Production Pattern: Pagination Loop
//        int page = 0;
//        Page<User> result;
//
//        do {
//            result = userRepository.findAll(PageRequest.of(page, 100));
//            result.getContent().forEach(this::processUser);
//            page++;
//        } while (result.hasNext());

//        int attempts = 0;
//
//        while (attempts < 3) {
//            try {
//                paymentService.charge();/
//                break;
//            } catch (Exception ex) {
//                attempts++;
//            }
//        }


    }
}
