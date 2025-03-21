//Q8: Write a program that takes three boolean inputs and prints true if at least two of them are true .
//Hint : Use logical operators (&&,||)
import java.util.Scanner;

public class AtLeastTwoTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking three boolean inputs
        System.out.print("Enter first boolean value (true/false): ");
        boolean b1 = scanner.nextBoolean();
        
        System.out.print("Enter second boolean value (true/false): ");
        boolean b2 = scanner.nextBoolean();
        
        System.out.print("Enter third boolean value (true/false): ");
        boolean b3 = scanner.nextBoolean();
        
        // Checking if at least two of them are true using logical operators
        boolean result = (b1 && b2) || (b1 && b3) || (b2 && b3);
        
        // Printing the result
        System.out.println("At least two values are true: " + result);
        
        scanner.close();
    }
}
