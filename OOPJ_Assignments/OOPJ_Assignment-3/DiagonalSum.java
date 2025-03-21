//Q25. Find the Diagonal Sum
//○ Compute the sum of both diagonals in a square matrix.
import java.util.Scanner;

public class DiagonalSum {

    // Method to calculate the sum of both diagonals
    public static void findDiagonalSum(int[][] matrix, int n) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i]; // Primary diagonal
            secondaryDiagonalSum += matrix[i][n - 1 - i]; // Secondary diagonal
        }

        // Display the results
        System.out.println("Sum of Primary Diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondaryDiagonalSum);
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the matrix
        System.out.print("Enter the size of the matrix (N x N): ");
        int n = sc.nextInt();

        // Input the elements of the matrix
        int[][] matrix = new int[n][n];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        printMatrix(matrix, n);

        // Find and print the sum of both diagonals
        findDiagonalSum(matrix, n);

        sc.close();
    }
}
