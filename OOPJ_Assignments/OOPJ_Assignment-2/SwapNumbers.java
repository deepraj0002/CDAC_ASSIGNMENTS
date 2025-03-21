//Q1: Write a program to swap two numbers without using a third variable and without using arithmetic operators like + or - .
//Hint : Use bitwise XOR ^ operator.
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        a = a ^ b; // Step 1: XOR a and b, store in a
        b = a ^ b; // Step 2: XOR new a with b, store in b (original a)
        a = a ^ b; // Step 3: XOR new a with new b, store in a (original b)
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        scanner.close();
    }
}