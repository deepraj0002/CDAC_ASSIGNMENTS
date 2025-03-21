//Q12. Write a program to accept 20 integer numbers in a single Dimensional Array. Find and Display the following:
//○ Number of even numbers.
//○ Number of odd numbers.
//○ Number of multiples of 3
import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 20 integers
        int[] arr = new int[20];

        // Accept 20 integers from the user
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize counters for even numbers, odd numbers, and multiples of 3
        int evenCount = 0, oddCount = 0, multipleOf3Count = 0;

        // Iterate through the array and calculate the required statistics
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;  // If the number is even, increment evenCount
            } else {
                oddCount++;  // If the number is odd, increment oddCount
            }

            if (arr[i] % 3 == 0) {
                multipleOf3Count++;  // If the number is a multiple of 3, increment multipleOf3Count
            }
        }

        // Display the results
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of multiples of 3: " + multipleOf3Count);

        scanner.close();
    }
}
