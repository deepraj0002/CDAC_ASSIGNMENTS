//Q11: Write a program to check if a given number is a power of 2 using bitwise operators.
//Hint : n & (n - 1) == 0 for positive numbers
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Checking if the number is a power of 2 using bitwise operator
        boolean isPowerOfTwo = (n > 0) && (n & (n - 1)) == 0;
        
        if (isPowerOfTwo) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }

        scanner.close();
    }
}
