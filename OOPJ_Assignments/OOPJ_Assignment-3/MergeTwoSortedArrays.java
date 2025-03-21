//Q8. Merge Two Sorted Arrays
// Merge two sorted arrays into a single sorted array without using extra space.
import java.util.Scanner;
import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] s1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < n1; i++) {
            s1[i] = scanner.nextInt();
        }

        // Taking user input for the second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] s2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int i = 0; i < n2; i++) {
            s2[i] = scanner.nextInt();
        }

        // Sorting the arrays first
        Arrays.sort(s1);
        Arrays.sort(s2);

        // Merged array
        int[] res = new int[s1.length + s2.length];  // Resultant merged array
        int i = 0, j = 0, k = 0;

        // Merging arrays
        while (i < s1.length && j < s2.length) {
            if (s1[i] < s2[j]) {
                res[k++] = s1[i++];
            } else {
                res[k++] = s2[j++];
            }
        }

        // Copy remaining elements of s1, if any
        while (i < s1.length) {
            res[k++] = s1[i++];
        }

        // Copy remaining elements of s2, if any
        while (j < s2.length) {
            res[k++] = s2[j++];
        }

        // Printing the merged array
        System.out.println("Merged array:");
        print(res);

        scanner.close();
    }

    // Method to print the array
    public static void print(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}


