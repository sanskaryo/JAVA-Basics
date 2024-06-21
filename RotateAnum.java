public class RotateAnum {

    public static void main(String[] args) {
        int number = 12345;
        int k = 3;

        // Rotate the number to the left by k positions
        int rotatedNumber = rotateLeft(number, k);

        // Print the rotated number
        System.out.println(rotatedNumber);
    }

    public static int rotateLeft(int number, int k) {
        // Get the number of digits in the number
        int numDigits = (int) (Math.log10(number) + 1);

        // Reduce k to a value between 0 and numDigits - 1
        k = k % numDigits;

        // Create a new number to store the rotated number
        int rotatedNumber = 0;

        // Rotate the digits of the number
        for (int i = 0; i < numDigits; i++) {
            int digit = (number % 10);
            rotatedNumber = rotatedNumber * 10 + digit;
            number /= 10;
        }

        // Shift the rotated number to the left by k positions
        rotatedNumber = rotatedNumber << k;

        // Return the rotated number
        return rotatedNumber;
    }
}