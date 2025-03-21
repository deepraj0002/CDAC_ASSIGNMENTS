//4. Create a Java program that converts a given integer to a double and vice versa using wrapper classes. 
import java.util.Scanner;

public class WrapperClassConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer value
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Convert Integer to Double using wrapper class
        Integer integerObject = intValue;  // Autoboxing
        Double doubleValue = integerObject.doubleValue();  // Convert Integer to Double

        System.out.println("\nInteger value: " + integerObject);
        System.out.println("Converted to Double: " + doubleValue);

        // Input a double value
        System.out.print("\nEnter a double value: ");
        double doubleValue2 = scanner.nextDouble();

        // Convert Double to Integer using wrapper class
        Double doubleObject = doubleValue2;  // Autoboxing
        Integer intValue2 = doubleObject.intValue();  // Convert Double to Integer

        System.out.println("\nDouble value: " + doubleObject);
        System.out.println("Converted to Integer: " + intValue2);

        scanner.close();
    }
}
