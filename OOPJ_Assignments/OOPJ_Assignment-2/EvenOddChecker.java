//Q2: Write a program to check whether a given number is even or odd using only bitwise operators .
//Hint : Use n & 1 to check.
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if ((n & 1) == 0) {
            System.out.println(n + " is Even Number.");
        } else {
            System.out.println(n + " is Odd Number.");
        }
        
        scanner.close();
    }
}
