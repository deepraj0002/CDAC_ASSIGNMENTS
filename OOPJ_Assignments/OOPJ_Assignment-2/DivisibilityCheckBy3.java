//Q4: Write a program to find whether a given number is divisible by 3 without using the modulus ( % ) or division ( / ) operators.
//Hint : Use subtraction and bitwise shifts
import java.util.Scanner;

public class DivisibilityCheckBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int originalNumber = n; // Store the original number for output

        if (n < 0) {
            n = -n; // Convert to positive
        }

        while (n > 3) {
            n = (n & 3) + (n >> 2); // Reduce number using bitwise operations
        }

        if (n == 0 || n == 3)
            System.out.println(originalNumber + " is divisible by 3");
        else
            System.out.println(originalNumber + " is not divisible by 3");

        scanner.close();
    }
}
