//Q13. Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class students in a single Dimensional Array. Find and display the following:
//○ Number of students securing 75% and above in aggregate.
//○ Number of students securing 40% and below in aggregate.
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store marks of 20 students
        int[][] marks = new int[20][3];  // 20 students, 3 subjects (Physics, Chemistry, Maths)
        
        // Accept marks for 20 students
        System.out.println("Enter the marks for 20 students in Physics, Chemistry, and Maths:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Student " + (i + 1) + " - Enter marks for Physics, Chemistry, and Maths: ");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner.nextInt();  // Accept marks for each subject
            }
        }

        // Initialize counters for students scoring 75% and above, and 40% and below
        int above75Count = 0, below40Count = 0;

        // Iterate through each student to calculate the aggregate marks and check the conditions
        for (int i = 0; i < 20; i++) {
            // Calculate the aggregate percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (totalMarks / 300.0) * 100;

            // Check the conditions for 75% and above, 40% and below
            if (percentage >= 75) {
                above75Count++;
            } else if (percentage <= 40) {
                below40Count++;
            }
        }

        // Display the results
        System.out.println("Number of students securing 75% and above in aggregate: " + above75Count);
        System.out.println("Number of students securing 40% and below in aggregate: " + below40Count);

        scanner.close();
    }
}
