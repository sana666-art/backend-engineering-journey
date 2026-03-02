package com.backendDevelopment.B$OperatorsIfElseAndNumberSystem;

import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {

//        List of Relational Operators
//        Operator	    Meaning	                Example
//                >	    Greater than	        a > b
//                <	    Less than	            a < b
//                >=	Greater than or equal	a >= b
//                <=	Less than or equal	    a <= b
//                ==	Equal to	            a == b
//                !=	Not equal to	        a != b
//
//        All return boolean.

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving License Portal");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to drive");
        } else {
            System.out.println("Beta cycle chalao");
        }
    }
}
