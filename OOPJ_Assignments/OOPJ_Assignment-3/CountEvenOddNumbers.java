//Q4Count Even and Odd Numbers
 //Count the number of even and odd numbers in an array.
 import java.util.Scanner;

public class CountEvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array should have at least one element.");
            return;
        }

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        countEvenOdd(arr);
        scanner.close();
    }

    public static void countEvenOdd(int[] arr) {
        int ecount = 0, ocount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                ecount++;
            } else {
                ocount++;
            }
        }
        System.out.println("Even Count: " + ecount + ", Odd Count: " + ocount);
    }
}
