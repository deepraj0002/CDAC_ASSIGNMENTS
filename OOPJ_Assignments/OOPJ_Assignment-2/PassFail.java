//Q18: Given a student’s percentage, print “Pass” if the percentage is 40 or above; otherwise, print “Fail” , using only the ternary operator.
import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's percentage: ");
        int percentage = scanner.nextInt();
        
        // Checking pass or fail using the ternary operator
        String result = (percentage >= 40) ? "Pass" : "Fail";
        
        System.out.println("The student has: " + result);
        
        scanner.close();
    }
}
