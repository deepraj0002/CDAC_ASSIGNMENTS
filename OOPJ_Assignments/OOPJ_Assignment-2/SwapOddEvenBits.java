//Q15: Implement a program to swap odd and even bits of a number using bitwise operators.
//Hint : Use masks: (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1 .
import java.util.Scanner;

public class SwapOddEvenBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        
        // Mask for odd and even bits
        int oddMask = 0xAAAAAAAA;  // Mask for odd positions (101010... in binary)
        int evenMask = 0x55555555; // Mask for even positions (010101... in binary)
        
        // Swap odd and even bits using bitwise operators
        int swapped = ((x & oddMask) >> 1) | ((x & evenMask) << 1);
        
        System.out.println("The number after swapping odd and even bits is: " + swapped);
        
        scanner.close();
    }
}
