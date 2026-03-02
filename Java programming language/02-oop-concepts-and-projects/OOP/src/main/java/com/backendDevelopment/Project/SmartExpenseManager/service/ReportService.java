package com.backendDevelopment.Project.SmartExpenseManager.service;

import com.backendDevelopment.Project.SmartExpenseManager.model.Expense;
import com.backendDevelopment.Project.SmartExpenseManager.model.Income;
import com.backendDevelopment.Project.SmartExpenseManager.model.Transaction;
import com.backendDevelopment.Project.SmartExpenseManager.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportService {

    public double calculateTotalIncome(User user) {
        double total = 0;

        for (Transaction t : user.getTransactions()) {
            if (t instanceof Income) {
                total += t.getAmount();
            }
        }

        return total;
    }

    public double calculateTotalExpense(User user) {
        double total = 0;

        for (Transaction t : user.getTransactions()) {
            if (t instanceof Expense) {
                total += t.getAmount();
            }
        }

        return total;
    }

    public Map<String, Double> expenseByCategory(User user) {

        Map<String, Double> categoryTotals = new HashMap<>();

        for (Transaction t : user.getTransactions()) {

            if (t instanceof Expense expense) {

                String categoryName = expense.getCategory().getName();

                categoryTotals.put(
                        categoryName,
                        categoryTotals.getOrDefault(categoryName, 0.0) + expense.getAmount()
                );
            }
        }

        return categoryTotals;
    }

    public void printSummary(User user) {

        System.out.println("===== FINANCIAL SUMMARY =====");

        System.out.println("Total Income: " + calculateTotalIncome(user));
        System.out.println("Total Expense: " + calculateTotalExpense(user));
        System.out.println("Balance: " + user.calculateBalance());

        System.out.println("\nExpense by Category:");

        Map<String, Double> categoryMap = expenseByCategory(user);

        for (String category : categoryMap.keySet()) {
            System.out.println(category + " : " + categoryMap.get(category));
        }
    }
}