//Q23. Matrix Multiplication
//○ Multiply two matrices and return the resultant matrix.
import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows for the first matrix: ");
        int m1 = sc.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int n1 = sc.nextInt();

        // Matrix 1
        int[][] matrix1 = new int[m1][n1];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input matrix dimensions for second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int m2 = sc.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int n2 = sc.nextInt();

        // Matrix 2
        if (n1 != m2) {
            System.out.println("Matrix multiplication is not possible. Number of columns of Matrix 1 must equal the number of rows of Matrix 2.");
            return;
        }

        int[][] matrix2 = new int[m2][n2];
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Resultant matrix
        int[][] result = new int[m1][n2];

        // Matrix multiplication
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Output the resultant matrix
        System.out.println("Resultant Matrix after multiplication:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

