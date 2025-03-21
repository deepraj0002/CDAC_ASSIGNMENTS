//6. Develop a program that takes user input for a character and prints whether it is a vowel or consonant. 
import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);  // Read a single character

        // Convert the character to lowercase to handle both cases (upper and lower)
        ch = Character.toLowerCase(ch);

        // Check if the input character is a vowel or consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Invalid input! Please enter a valid alphabetic character.");
        }

        // Close the scanner
        scanner.close();
    }
}
