//Q19: Write a Java program that checks whether a character is uppercase, lowercase, or not a letter using only the ternary operator.
import java.util.Scanner;

public class UpperLowerNotALetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        // Checking if the character is uppercase, lowercase, or not a letter using ternary operator
        String result = (Character.isUpperCase(ch)) ? "Uppercase" : (Character.isLowerCase(ch)) ? "Lowercase" : "Not a letter";
        
        System.out.println("The character is: " + result);
        
        scanner.close();
    }
}
