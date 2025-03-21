//2. Write a Java program that takes two integers as input and performs all arithmetic operations on them. 
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Perform arithmetic operations and display the results
        int add = num1 + num2;
        int substract = num1 - num2;
        int multiply = num1 * num2;
        double divide = (double)num1 / num2;
        int remainder = num1 % num2;

        // Output the results
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + substract);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + divide);
        System.out.println("Remainder: " + remainder);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
