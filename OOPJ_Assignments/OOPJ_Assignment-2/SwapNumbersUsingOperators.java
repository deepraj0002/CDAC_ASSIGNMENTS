//Q5: Write a Java program to swap two numbers using the += and -= operators only.
import java.util.Scanner;

public class SwapNumbersUsingOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Swapping the numbers using += and -= operators
        num1 += num2;  // num1 becomes the sum of num1 and num2
        num2 = num1 - num2;  // num2 becomes the original num1
        num1 -= num2;  // num1 becomes the original num2
        
        // Displaying the swapped values
        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        scanner.close();
    }
}
