//Q16: Write a program that determines whether a given number is positive, negative, or zero using only the ternary operator .
import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Determine if the number is positive, negative, or zero using the ternary operator
        String result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
        
        System.out.println("The number is: " + result);
        
        scanner.close();
    }
}
