package com.backendDevelopment.B$OperatorsIfElseAndNumberSystem;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you a female? (true/false) ");
        boolean isFemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("You got 75% discount");
        } else if (isFemale) {
            System.out.println("You got 50% discount");
        } else if (age > 60 && !isFemale) {
            System.out.println("You got 25% discount");
        } else {
            System.out.println("You got no discount");
        }

//        int age = 25;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense) {
            System.out.println("Allowed to drive");
        } else {
            System.out.println("Not allowed");
        }

        boolean isAdmin = false;
        boolean isManager = true;

        if (isAdmin || isManager) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        boolean isLoggedIn = false;

        if (!isLoggedIn) {
            System.out.println("Please log in");
        }

        int x = 5;

        if (x > 10 && x++ > 5) {
            System.out.println("Hello");
        }

        System.out.println(x);

        int Y = 5;

        if (Y < 10 || Y++ > 5) {
            System.out.println("Hello");
        }

        System.out.println(Y);

    }
}
