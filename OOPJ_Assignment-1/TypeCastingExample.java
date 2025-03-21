//3. Implement a Java program to demonstrate implicit and explicit type casting. 
import java.util.Scanner;

public class TypeCastingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Implicit Type Casting (Widening)
        System.out.print("Enter an integer: ");
        int num1 = scanner.nextInt();
        double num2 = num1;  // int to double (implicit casting)
        
        System.out.println("\nImplicit Casting:");
        System.out.println("Original int value: " + num1);
        System.out.println("Casted double value: " + num2);

        // Explicit Type Casting (Narrowing)
        System.out.print("\nEnter a double value: ");
        double num3 = scanner.nextDouble();
        int num4 = (int) num3;  // double to int (explicit casting)
        
        System.out.println("\nExplicit Casting:");
        System.out.println("Original double value: " + num3);
        System.out.println("Casted int value: " + num4);
        
        scanner.close();
    }
}
