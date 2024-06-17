import java.util.Scanner;

public class twodarray {

    // Method to print a 2D matrix
    static void printmatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Method to find the transpose of a 2D matrix
    static int[][] findtranspose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    // Main method to read input and call the above methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();    
        
        int[][] matrix = new int[r][c];
        int totalElements = r * c;

        System.out.println("Enter " + totalElements + " values:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printmatrix(matrix);

        int[][] transposedMatrix = findtranspose(matrix, r, c);

        System.out.println("Transposed Matrix:");
        printmatrix(transposedMatrix);

        sc.close();
    }
}
