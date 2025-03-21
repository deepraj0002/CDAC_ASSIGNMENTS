//Q21: Write a program that increments a number without using + or ++ operators Hint : Use bitwise - (~x) .
import java.util.Scanner;

public class IncrementWithoutPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Incrementing without + or ++ using bitwise NOT (~)
        int incrementedValue = -~n; // This is equivalent to n + 1
        
        System.out.println("Incremented value: " + incrementedValue);
        
        scanner.close();
    }
}
