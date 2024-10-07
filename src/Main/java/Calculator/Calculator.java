package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        char operator = input.next().charAt(0);

        // Ask users to enter numbers
        System.out.println("Enter first number:");
        double number1 = input.nextDouble();
        System.out.println("Enter second number:");
        double number2 = input.nextDouble();

        double result = 0; // Initialize result

        switch (operator) {
            // Performs addition
            case '+':
                result = number1 + number2;
//                System.out.println(number1 + " + " + number2 + " = " + result);
                input.close();
                break;

            // Performs subtraction
            case '-':
                result = number1 - number2;
//                System.out.println(number1 + " - " + number2 + " = " + result);
                input.close();
                break;

            // Performs multiplication
            case '*':
                result = number1 * number2;
//                System.out.println(number1 + " * " + number2 + " = " + result);
                input.close();
                break;

            // Performs division
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
//                    System.out.println(number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                input.close();
                break;

            default:
                System.out.println("Invalid operator!");
                input.close();
                return; // Exit the program if the operator is invalid
        }

        // Display the result
        System.out.println("The result of the operation is: " + result);


    }
}
