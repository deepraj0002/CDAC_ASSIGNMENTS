//Q21. Row-wise and Column-wise Sum
//○ Find the sum of each row and each column of a given matrix.
import java.util.Scanner;

public class MatrixSumRowWiseAndColumnWise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for matrix dimensions (m x n)
        System.out.print("Enter the number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = sc.nextInt();

        // Declare the matrix
        int[][] matrix = new int[m][n];

        // Input elements for the matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Row-wise sum
        System.out.println("\nRow-wise sum:");
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        // Column-wise sum
        System.out.println("\nColumn-wise sum:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }

        sc.close();
    }
}
