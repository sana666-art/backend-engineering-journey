package com.backendDevelopment.Project.SmartExpenseManager.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<Transaction> transactions;

    public User(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public double calculateBalance() {
        double balance = 0;

        for (Transaction t : transactions) {
            if (t.getType().equals("INCOME")) {
                balance += t.getAmount();
            } else {
                balance -= t.getAmount();
            }
        }

        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
