//Q7. Rotate an Array
//Rotate the array to the right by k positions.
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Taking array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking input for the number of positions to rotate
        System.out.print("Enter the number of positions to rotate by: ");
        int k = scanner.nextInt();

        // Normalize k to avoid unnecessary rotations
        k = k % n;  // In case k > n, rotate only k % n times

        // Rotating the array by k positions
        rotateArray(arr, k);

        // Printing the rotated array
        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    public static void rotateArray(int[] arr, int k) {
        // Reverse the whole array
        reverse(arr, 0, arr.length - 1);

        // Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Reverse the remaining elements
        reverse(arr, k, arr.length - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers
            start++;
            end--;
        }
    }
}
