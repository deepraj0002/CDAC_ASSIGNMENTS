//Q20. Sum of Two Matrices
//○ Given two matrices of the same size, compute their sum.
import java.util.Scanner;

public class SumOfTwoMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for matrix dimensions (m x n)
        System.out.print("Enter the number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = sc.nextInt();

        // Declare two matrices and the result matrix
        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];
        int[][] sumMatrix = new int[m][n];

        // Input for the first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input for the second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Compute the sum of the two matrices
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the sum matrix
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
