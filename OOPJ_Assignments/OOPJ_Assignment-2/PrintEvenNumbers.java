//Q24: Write a program that prints all even numbers from 1 to 100 using only bitwise AND ( & ) and for loop.
public class PrintEvenNumbers {
    public static void main(String[] args) {
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Using bitwise AND (&) to check if the number is even
            // If i & 1 is 0, it means the number is even.
            if ((i & 1) == 0) {
                System.out.print(i + " "); // Print even number
            }
        }
    }
}
