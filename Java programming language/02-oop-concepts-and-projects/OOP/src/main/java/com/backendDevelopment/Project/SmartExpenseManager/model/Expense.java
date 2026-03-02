package com.backendDevelopment.Project.SmartExpenseManager.model;
import com.backendDevelopment.Project.SmartExpenseManager.model.Category;

public class Expense extends Transaction {

    private Category category;

    public Expense(double amount, String description, Category category) {
        super(amount, description);
        this.category = category;
    }

    @Override
    public String getType() {
        return "EXPENSE";
    }

    public Category getCategory() {
        return category;
    }
}
