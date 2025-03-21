//Q14. Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. 
//Transfer and store all the even numbers in an array even[ ] and all the odd numbers in another array odd[ ]. 
//Finally, print the elements of the even & the odd array.
import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        int n = 20; // Limit of numbers to be entered
        Scanner sc = new Scanner(System.in);
        
        // Arrays to store even and odd numbers
        int[] even = new int[n];
        int[] odd = new int[n];
        int[] arr = new int[n];
        
        int evencount = 0, oddcount = 0;
        
        System.out.println("Enter 20 numbers (no more than 20):");
        
        // Take input for the array
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next(); // Clear the invalid input
                i--; // Decrement i to ensure 20 valid numbers are entered
            }
        }

        // Separate the numbers into even and odd arrays
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[evencount++] = arr[i];
            } else {
                odd[oddcount++] = arr[i];
            }
        }

        // Print the odd numbers
        System.out.println("Odd Numbers: ");
        for (int i = 0; i < oddcount; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print the even numbers
        System.out.println("\nEven Numbers: ");
        for (int i = 0; i < evencount; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close(); // Close the scanner
    }
}
