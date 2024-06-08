import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read an integer input
        printFactorial(n); // Call the method to print the factorial
        sc.close(); // Close the scanner to avoid resource leaks
    }

    public static void printFactorial(int n) {
        if (n < 0) { // Check if the input is a negative number
            System.out.println("Invalid number");
            return; // Exit the method if the number is invalid
        }
        int factorial = 1; // Initialize factorial to 1

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i; // Multiply the current value of factorial by i
        }

        System.out.println("Factorial of " + n + " is: " + factorial); // Print the resulting factorial
    }
}
