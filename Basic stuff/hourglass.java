import java.util.Scanner;

public class hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = scanner.nextInt();

        for (int i = N; i >= 0; i--) {
            // Print leading spaces
            for (int j = N; j > i; j--) {
                System.out.print("  ");
            }
            // Print decreasing numbers
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        

    }}
