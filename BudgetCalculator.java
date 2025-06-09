public class BudgetCalculator {
    public static final double SALARY = 4000.0;
    public static final double SAVINGS_PERCENT = 0.10;
    public static final double RENT_PERCENT = 0.30;
    public static final double GROCERIES_PERCENT = 0.15;
    public static final double ENTERTAINMENT_PERCENT = 0.10;
    
    public static void main(String[] args){
        double monthlySalary = SALARY;
        double savedAmount;
        double rentAmount;
        double groceriesAmount;
        double entertainmentAmount;
        double totalExpenses;
        double remainingBalance;
        savedAmount = monthlySalary * SAVINGS_PERCENT;
        rentAmount = monthlySalary * RENT_PERCENT;
        groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
        totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        remainingBalance = monthlySalary - totalExpenses;

        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Amount Saved: $" + savedAmount);
        System.out.println("Amount Spent on Rent: $" + rentAmount);
        System.out.println("Amount Spent on Groceries: $" + groceriesAmount);
        System.out.println("Amount Spent on Entertainment: $" + entertainmentAmount);
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Remaining Balance: $" + remainingBalance);
    }
}