//Q24. Rotate a Matrix by 90 Degrees
//○ Rotate a given N x N matrix by 90 degrees clockwise.
import java.util.Scanner;

public class RotateMatrix {

    // Method to rotate the matrix by 90 degrees clockwise
    public static void rotateMatrix(int[][] matrix, int n) {
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap elements matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                // Swap elements of the row
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
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

        // Rotate the matrix by 90 degrees
        rotateMatrix(matrix, n);

        // Print the rotated matrix
        System.out.println("Matrix after rotating by 90 degrees clockwise:");
        printMatrix(matrix, n);
        
        sc.close();
    }
}
