//Q14: Write a program to count the number of 1s (set bits) in a binary representation of a number using bitwise operations.
//Hint : Use n & (n - 1)
import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Counting the number of set bits (1s) in the binary representation
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        
        System.out.println("The number of 1s in the binary representation is: " + count);
        
        scanner.close();
    }
}
