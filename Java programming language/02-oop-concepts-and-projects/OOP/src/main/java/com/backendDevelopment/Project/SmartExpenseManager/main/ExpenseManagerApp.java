package com.backendDevelopment.Project.SmartExpenseManager.main;

import com.backendDevelopment.Project.SmartExpenseManager.model.Category;
import com.backendDevelopment.Project.SmartExpenseManager.model.Expense;
import com.backendDevelopment.Project.SmartExpenseManager.model.Income;
import com.backendDevelopment.Project.SmartExpenseManager.model.User;
import com.backendDevelopment.Project.SmartExpenseManager.service.ReportService;

import java.util.Scanner;

public class ExpenseManagerApp {
//    public static void main(String[] args) {
//
//        Category food = new Category("Food", "Daily meals");
//        Category utilities = new Category("Utilities", "Bills");
//
//        User user = new User("Sana");
//
//        user.addTransaction(new Income(50000, "Salary"));
//        user.addTransaction(new Expense(5000, "Groceries", food));
//        user.addTransaction(new Expense(2000, "Internet Bill", utilities));
//
//        ReportService reportService = new ReportService();
//        reportService.printSummary(user);
//    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        User user = new User(name);
        ReportService reportService = new ReportService();

        boolean running = true;

        while (running) {

            System.out.println("\n===== EXPENSE MANAGER MENU =====");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Report");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {

                case 1 -> addIncome(user);

                case 2 -> addExpense(user);

                case 3 -> reportService.printSummary(user);

                case 4 -> {
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                }

                default -> System.out.println("Invalid option!");
            }
        }
    }

    private static void addIncome(User user) {

        System.out.print("Enter income amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        user.addTransaction(new Income(amount, description));

        System.out.println("Income added successfully!");
    }

    private static void addExpense(User user) {

        System.out.print("Enter expense amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        System.out.print("Enter category name: ");
        String categoryName = scanner.nextLine();

        Category category = new Category(categoryName, "User defined");

        user.addTransaction(new Expense(amount, description, category));

        System.out.println("Expense added successfully!");
    }
}
