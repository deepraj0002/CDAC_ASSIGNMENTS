//Q2. Reverse an Array
// Reverse the given array in place.
import java.util.Scanner;

public class ReverseArray {
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

        // Reverse the array in place
        int left = 0, right = n - 1;
        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // Display the reversed array
        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

