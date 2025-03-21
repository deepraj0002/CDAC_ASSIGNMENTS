/*Q16. Given two sorted arrays A and B of size p and q, write a Java program to merge elements of
A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B
with remaining elements.
Example:
Input :
int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]*/
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void mergeSortedArrays(int[] A, int[] B) {
        int p = A.length, q = B.length;
        
        // Step 1: Sort input arrays
        Arrays.sort(A);
        Arrays.sort(B);

        int[] merged = new int[p + q];
        int i = 0, j = 0, k = 0;

        // Step 2: Merge sorted arrays
        while (i < p && j < q) {
            if (A[i] <= B[j]) {
                merged[k++] = A[i++];
            } else {
                merged[k++] = B[j++];
            }
        }

        // Copy remaining elements from A
        while (i < p) {
            merged[k++] = A[i++];
        }

        // Copy remaining elements from B
        while (j < q) {
            merged[k++] = B[j++];
        }

        // Step 3: Split merged array back into A and B
        System.arraycopy(merged, 0, A, 0, p);
        System.arraycopy(merged, p, B, 0, q);

        // Print the sorted arrays
        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for array sizes
        System.out.print("Enter size of A: ");
        int p = sc.nextInt();
        System.out.print("Enter size of B: ");
        int q = sc.nextInt();

        int[] A = new int[p];
        int[] B = new int[q];

        // Take input for A
        System.out.println("Enter " + p + " elements for A:");
        for (int i = 0; i < p; i++) {
            A[i] = sc.nextInt();
        }

        // Take input for B
        System.out.println("Enter " + q + " elements for B:");
        for (int i = 0; i < q; i++) {
            B[i] = sc.nextInt();
        }

        // Merge and sort the arrays
        mergeSortedArrays(A, B);

        sc.close();
    }
}
