//Q1. Find the Largest and Smallest Element
//Given an array, find the smallest and largest elements in it.
import java.util.Scanner;

public class SmallestLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Declare the array
        int[] arr = new int[n];

        // Taking user input
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize smallest and largest with first element
        int smallest = arr[0];
        int largest = arr[0];

        // Loop through the array to find smallest and largest
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Display results
        System.out.println("Smallest Element: " + smallest);
        System.out.println("Largest Element: " + largest);

        scanner.close();
    }
}
