import java.util.Scanner;

public class BudgetCalculator {
    private double income;
    private double totalExpenses;

    public BudgetCalculator() {
        this.income = 0;
        this.totalExpenses = 0;
    }

    public void inputIncome(Scanner scanner) {
        System.out.print("Enter your monthly income: ");
        income = scanner.nextDouble();
    }

    public void inputExpenses(Scanner scanner) {
        System.out.print("Enter the number of expense items: ");
        int numExpenses = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        for (int i = 1; i <= numExpenses; i++) {
            System.out.print("Enter the name of expense " + i + ": ");
            String expenseName = scanner.nextLine();
            System.out.print("Enter the cost of " + expenseName + ": ");
            double expenseCost = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
            totalExpenses += expenseCost;
        }
    }

    public void displayBudgetSummary() {
        double remainingBudget = income - totalExpenses;

        System.out.println("\n--- Budget Summary ---");
        System.out.println("Total Income: $" + income);
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Remaining Budget: $" + remainingBudget);

        if (remainingBudget < 0) {
            System.out.println("Warning: You have exceeded your budget!");
        } else {
            System.out.println("You are within your budget. Great job!");
        }
    }
}