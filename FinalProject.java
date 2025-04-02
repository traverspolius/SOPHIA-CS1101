import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an instance of BudgetCalculator
       BudgetCalculator budgetCalculator = new BudgetCalculator();
        
        // Use BudgetCalculator methods
        budgetCalculator.inputIncome(scanner);
        budgetCalculator.inputExpenses(scanner);
        budgetCalculator.displayBudgetSummary();

        scanner.close();
    }
}