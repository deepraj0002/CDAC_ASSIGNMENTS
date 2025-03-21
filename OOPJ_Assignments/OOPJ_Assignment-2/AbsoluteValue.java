//Q13: Implement a Java program to find the absolute value of an integer using bitwise operators.
//Hint : mask = num >> 31; abs = (num + mask) ^ mask;
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Using bitwise operators to calculate the absolute value
        int mask = num >> 31;
        int absValue = (num + mask) ^ mask;
        
        System.out.println("The absolute value of " + num + " is: " + absValue);
        
        scanner.close();
    }
}
