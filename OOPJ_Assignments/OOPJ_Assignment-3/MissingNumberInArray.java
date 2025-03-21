//Q9. Find Missing Number in an Array
//Given an array of size n-1 containing numbers from 1 to n, find the missing number.
import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of array (n-1)
        System.out.print("Enter the size of the array (n-1): ");
        int nMinusOne = scanner.nextInt();
        int n = nMinusOne + 1;  // Original size of the array
        
        // Input array elements
        int[] arr = new int[nMinusOne];
        System.out.println("Enter " + nMinusOne + " elements for the array (numbers from 1 to " + n + "):");
        for (int i = 0; i < nMinusOne; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the missing number
        int missingNumber = findMissingNumber(arr, n);

        // Output the missing number
        System.out.println("The missing number is: " + missingNumber);
        
        scanner.close();
    }

    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of numbers from 1 to n using the formula
        int expectedSum = n * (n + 1) / 2;

        // Calculate the sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between expected sum and actual sum
        return expectedSum - actualSum;
    }
}
