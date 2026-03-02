package com.backendDevelopment.Project.SmartExpenseManager.service;

import com.backendDevelopment.Project.SmartExpenseManager.model.Transaction;
import com.backendDevelopment.Project.SmartExpenseManager.model.User;

public class TransactionService {

    public void printAllTransactions(User user) {
        for (Transaction t : user.getTransactions()) {
            System.out.println(
                    t.getType() + " | " +
                            t.getAmount() + " | " +
                            t.getDescription()
            );
        }
    }
}