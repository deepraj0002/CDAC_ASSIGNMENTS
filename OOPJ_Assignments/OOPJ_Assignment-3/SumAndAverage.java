//Q5. Find Sum and Average
//Compute the sum and average of all elements in the array.
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Taking array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i]; // Compute sum
        }

        // Compute average
        double average = (double) sum / n;

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
