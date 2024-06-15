public class Main {
    public static void main(String[] args) {
        // Define a 3D array
        int[][][] array3D = new int[3][3][3];

        // Initialize the 3D array with values
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    array3D[i][j][k] = value;
                    value++;
                }
            }
        }

        // Print the 3D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("array3D[" + i + "][" + j + "][" + k + "] = " + array3D[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
