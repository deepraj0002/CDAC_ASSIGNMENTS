// Q10.write Java program that checks whether a given character is a vowel or a consonant using the ternary operator (? :)
import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        // Checking if the character is a vowel or consonant using the ternary operator
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                         ? "Vowel" : "Consonant";
        
        // Displaying the result
        System.out.println("The character " + ch + " is a " + result);
        
        scanner.close();
    }
}
