//Q9: Implement a Java program that checks if a number is within a specific range (20 to 50) without using if-else .
//Hint : Use logical AND ( && ) in a print statement .
import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
		// Logic to check if the number is within the range 20 to 50 using logical AND
        boolean isWithinRange = num >= 20 && num <= 50;
        
        // Printing the result separately
        System.out.println("The number " + num + (isWithinRange ? " is within the range of 20 to 50." : " is outside the range of 20 to 50."));
        
        scanner.close();
    }
}
