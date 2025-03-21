//Q6. Remove Duplicates from a Sorted Array
//Remove duplicate elements from a sorted array without using extra space
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Taking array input, accepting only exactly n elements
        System.out.println("Enter " + n + " elements:");

        // Accept exactly n elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sorting the array to ensure correctness
        Arrays.sort(arr);

        // Removing duplicates
        int newLength = removeDuplicates(arr);

        // Printing the unique elements
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0; // Handle empty array case

        int track = 1; // Pointer to place unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[track++] = arr[i]; // Place unique element
            }
        }

        return track; // Return new length
    }
}
