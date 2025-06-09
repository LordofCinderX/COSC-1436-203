import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         String continueChoice = "yes";

        while (continueChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter an operation (+, -, *, /, or exit): ");
            String operation = input.nextLine();

            // Check if user wants to exit
            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                continue;
            }

            // Validate operation input
            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
                System.out.println("Invalid operation. Please enter +, -, *, /, or exit.");
                continue;
            }

            // Get first number
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(input.nextLine());

            // Get second number
            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(input.nextLine());

            // Perform the operation using switch
            switch (operation) {
                case "+":
                    System.out.println("The result of " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("The result of " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("The result of " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Invalid input: Division with a zero is not allowed.");
                    } else {
                        System.out.println("The result of " + num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    break;   
            }
             System.out.print("Would you like to perform another operation? (yes/no): ");
                    continueChoice = input.nextLine();

        }
        System.out.println("Thank you for using the Java Calculator! Goodbye!");
        input.close();
    }
}