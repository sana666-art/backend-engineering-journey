package com.backendDevelopment.B$OperatorsIfElseAndNumberSystem;

public class Assignment {

    private double balance = 100.0;

    public Assignment(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double applyDiscount(double percent) {
        balance *= (1 - percent / 100);
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        int myInt = 9;
        System.out.println(myInt);
        int newInt = myInt;
        System.out.println(newInt);

        int number = 10;

        number += 5;   // 15
        number -= 3;   // 12
        number *= 2;   // 24
        number /= 4;   // 6
        number %= 4;   // 2

        System.out.println(number);

        int a = 5;  // 0101
        a &= 3;     // 0011

        System.out.println(a);  // 1

        int num = 4;  // 0100
        num <<= 1;    // 1000 (8)

//        Operator	Meaning
//        <<=	        Left shift and assign
//        >>=	        Right shift and assign
//        >>>=	    Unsigned right shift and assign

        System.out.println(num);

        int i = 5;
        int b = (i += 3);
        System.out.println(b);

        int e = 5;
        e /= 2;
        System.out.println(e);

        // Create object
        Assignment wallet = new Assignment(10000.0);

        // Call methods
        wallet.deposit(5002.0);
        wallet.withdraw(3023.0);

        double discountedBalance = wallet.applyDiscount(10);

        System.out.println("Balance after discount: " + discountedBalance);
        System.out.println("Final Balance: " + wallet.getBalance());

    }
}