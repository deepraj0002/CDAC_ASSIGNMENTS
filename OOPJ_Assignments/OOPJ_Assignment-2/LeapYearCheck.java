//Q7: Implement a Java program that checks whether a given year is a leap year or not using logical ( && , || ) operators .
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Checking if the year is a leap year using logical operators
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // Displaying the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        scanner.close();
    }
}
