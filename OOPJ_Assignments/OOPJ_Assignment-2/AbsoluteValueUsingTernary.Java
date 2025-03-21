//Q20: Implement a Java program that returns the absolute value of a given number using the ternary operator (without using Math.abs() ).
import java.util.Scanner;

public class AbsoluteValueUsingTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Finding absolute value using the ternary operator
        int absValue = (n < 0) ? -n : n;
        
        System.out.println("The absolute value is: " + absValue);
        
        scanner.close();
    }
}
