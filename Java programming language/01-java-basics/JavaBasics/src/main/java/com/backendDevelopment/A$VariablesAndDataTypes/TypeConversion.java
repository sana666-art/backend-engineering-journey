package com.backendDevelopment.A$VariablesAndDataTypes;

import java.math.BigDecimal;

public class TypeConversion {
    public static void main(String[] args) {

        int number = 100;
        double result = number;  // implicit conversion

        System.out.println("Int value: " + number);
        System.out.println("Converted to double: " + result);

        byte a = 10;
        byte b = 20;

        int result1 = a + b;  // promoted to int

        System.out.println(result1);

        double price1 = 19.99;
        int truncated = (int) price1; // explicit conversion

        System.out.println("Original: " + price1);
        System.out.println("After cast: " + truncated);

        float myFloat = 5;
        System.out.println(myFloat);

        int myInt = (int) 5.45f;
        System.out.println(myInt);

        BigDecimal price = new BigDecimal("19.99");
        BigDecimal quantity = new BigDecimal("3");

        BigDecimal total = price.multiply(quantity);

        System.out.println("Total: " + total);
    }
}
