//Q17: Implement a Java program that finds the minimum of four numbers using nested ternary operators
import java.util.Scanner;

public class MinimumOfFourNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for four numbers
        System.out.print("Enter four numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        // Finding the minimum using nested ternary operators
		int min = (a < b && a < c && a < d) ? a : (b < c && b < d) ? b : (c < d) ? c : d;
        
		System.out.println("The minimum value is: " + min);
        
        scanner.close();
    }
}