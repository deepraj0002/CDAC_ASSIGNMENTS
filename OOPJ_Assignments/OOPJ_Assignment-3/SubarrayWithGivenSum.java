//Q11. Find a Subarray with Given Sum
//Given an array of integers, find the subarray that sums to a given value S.
import java.util.Scanner;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size and elements for the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the target sum
        System.out.print("Enter the target sum (S): ");
        int targetSum = scanner.nextInt();

        // Find the subarray with the given sum
        findSubarrayWithSum(arr, targetSum);

        scanner.close();
    }

    public static void findSubarrayWithSum(int[] arr, int targetSum) {
        int currentSum = 0;
        int start = 0;

        // Iterate over the array using the sliding window technique
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            // Shrink the window if the current sum exceeds the target sum
            while (currentSum > targetSum && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            // If the current sum matches the target sum, print the subarray
            if (currentSum == targetSum) {
                System.out.println("Subarray found from index " + start + " to " + end + ":");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                return;  // Exit after finding the subarray
            }
        }

        // If no subarray is found
        System.out.println("No subarray found with the given sum.");
    }
}
