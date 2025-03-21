//Q23: Given a number, find whether it is odd or even using the & bitwise operator and print the result without using if-else 
import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Checking if the number is even or odd using bitwise AND (&)
        // If the least significant bit is 0, it's even; otherwise, it's odd.
        String result = (n & 1) == 0 ? "Even" : "Odd";
        
        System.out.println("The number is: " + result);
        
        scanner.close();
    }
}
