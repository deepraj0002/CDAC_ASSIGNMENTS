//Q12: Write a Java program to multiply a number by 8 without using * or / operators.
//Hint : Use bitwise left shift ( << ).
import java.util.Scanner;

public class MultiplyByEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Multiply by 8 using bitwise left shift
        int result = n << 3;
        
        System.out.println("The result of multiplying " + n + " by 8 is: " + result);
        
        scanner.close();
    }
}
