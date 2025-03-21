/*Q17. Write a Java program to find the maximum product of two integers in a given array of
integers.
Example:
Input :
nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
Output:
Pair is (7, 8),Maximum Product: 56
*/
import java.util.Arrays;
import java.util.Scanner;

public class MaxProductPair {
    public static void findMaxProduct(int[] nums) {
        int n = nums.length;

        if (n < 2) {
            System.out.println("Not enough numbers to find a pair.");
            return;
        }

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Calculate max product from:
        int product1 = nums[n - 1] * nums[n - 2]; // Two largest numbers
        int product2 = nums[0] * nums[1]; // Two smallest (negative) numbers

        // Step 3: Find the pair with the maximum product
        if (product1 > product2) {
            System.out.println("Pair is (" + nums[n - 2] + ", " + nums[n - 1] + "), Maximum Product: " + product1);
        } else {
            System.out.println("Pair is (" + nums[0] + ", " + nums[1] + "), Maximum Product: " + product2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the array
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Find the max product pair
        findMaxProduct(nums);

        sc.close();
    }
}
