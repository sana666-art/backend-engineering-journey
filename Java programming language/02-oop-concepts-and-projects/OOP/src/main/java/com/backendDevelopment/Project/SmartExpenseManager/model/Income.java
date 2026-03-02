package com.backendDevelopment.Project.SmartExpenseManager.model;

public class Income extends Transaction {

    public Income(double amount, String description) {
        super(amount, description);
    }

    @Override
    public String getType() {
        return "INCOME";
    }
}
