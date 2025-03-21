//Q19. Transpose of a Matrix
//○ Given a matrix, return its transpose (swap rows and columns).
import java.util.*;

// Class to perform matrix transpose
class TransposeMatrix {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in); // Create Scanner object to take input from the user
        
        // Input number of rows and columns for the matrix
        System.out.println("Enter number of rows: ");
        int c = sc.nextInt();
        
        System.out.println("Enter number of columns: ");
        int d = sc.nextInt();
        
        // Declare a 2D array (matrix) to store elements
        int a[][] = new int[c][d];
        
        // Take input for each element of the matrix
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                System.out.println("Enter element of Array at position (" + i + "," + j + "): ");
                a[i][j] = sc.nextInt();
            }
        }   
        
        // Display the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(a[i][j] + " "); // Print each element with a space
            }
            System.out.println(); // Move to the next line after each row
        }   
        
        // Declare a new array (matrix) to store the transpose
        int b[][] = new int[d][c];
        
        // Compute the transpose of the matrix
        for (int i = 0; i < d; i++) { // Rows of the transpose are columns of the original matrix
            for (int j = 0; j < c; j++) { // Columns of the transpose are rows of the original matrix
                b[i][j] = a[j][i];
            }
        }   
        
        // Display the transposed matrix
        System.out.println("Transpose of the Matrix:");
        for (int i = 0; i < d; i++) { // Loop through rows of the transposed matrix
            for (int j = 0; j < c; j++) { // Loop through columns of the transposed matrix
                System.out.print(b[i][j] + " "); // Print each element with a space
            }
            System.out.println(); // Move to the next line after each row
        }   
    }
}
