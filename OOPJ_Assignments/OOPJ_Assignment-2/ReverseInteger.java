//Q25: Implement a program that reverses an integer number without using string conversion ( StringBuilder or toCharArray ).
//Hint : Use while(n!=0) { rev = rev * 10 + n % 10; n /= 10;}
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int reversedNumber = 0; // Variable to store reversed number
        
        // Reverse the number using arithmetic operations
        while (n != 0) {
            int lastDigit = n % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + lastDigit; // Add it to reversed number
            n /= 10; // Remove the last digit from original number
        }
        
        System.out.println("Reversed number: " + reversedNumber);
        
        scanner.close();
    }
}
