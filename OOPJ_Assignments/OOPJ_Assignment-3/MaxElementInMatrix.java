//Q22. Find the Maximum Element in a Matrix
//○ Find the largest element in a given matrix.
import java.util.Scanner;

public class MaxElementInMatrix {

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

        // Find the maximum element in the matrix
        int maxElement = matrix[0][0]; // Initialize max with the first element
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }

        // Output the maximum element
        System.out.println("The maximum element in the matrix is: " + maxElement);
        
        sc.close();
    }
}
