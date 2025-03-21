//Q18. Print a Matrix
//○ Given an m x n matrix, print all its elements row-wise.
import java.util.Scanner;

public class PrintMatrix {
    public static void printMatrix(int[][] matrix) {
        // Loop through the matrix to print each row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");  // Print each element of the row
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the matrix dimensions
        System.out.print("Enter the number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = sc.nextInt();

        // Declare the matrix
        int[][] matrix = new int[m][n];

        // Take user input for the matrix elements
        System.out.println("Enter " + m * n + " elements for the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("\nMatrix:");
        printMatrix(matrix);

        sc.close();
    }
}
