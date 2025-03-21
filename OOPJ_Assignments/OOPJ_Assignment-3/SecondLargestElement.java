//Q3. Find the Second Largest Element
//Find the second-largest element in the given array
import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        findSecLarg(arr);
        scanner.close();
    }

    public static void findSecLarg(int[] arr) {
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Long.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("First largest: " + first + ", Second largest: " + second);
        }
    }
}


