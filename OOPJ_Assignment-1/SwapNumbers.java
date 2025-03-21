//5. Write a Java program to swap two numbers using a temporary variable and without using a temporary variable. 
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
		
		// Save original values to show after arithmetic swap
        int originalNum1 = num1;
        int originalNum2 = num2;

        // Swap using a temporary variable
        System.out.println("\nSwapping using a temporary variable:");
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Now swap them back using arithmetic operations (without a temporary variable)
        System.out.println("\nSwapping without using a temporary variable:");
      // Using the original input values for the arithmetic swap
        num1 = originalNum1 + originalNum2;  // Step 1: Add both numbers
        num2 = num1 - originalNum2;  // Step 2: Subtract new num1 from num2 (original num1)
        num1 = num1 - num2;  // Step 3: Subtract new num2 from num1 (original num2)

        // Print the numbers after swapping back to original values
        System.out.println("First number (original): " + num1);
        System.out.println("Second number (original): " + num2);
        

        scanner.close();
    }
}
