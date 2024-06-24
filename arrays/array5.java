// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class array5 {

    public static void main(String[] args) {

        int arr[] = {1, 3, 6, 8, 10};
        int N = arr.length;
        int k = 6;

        k = k % N;

        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        } //reverse 0 to K-1 index

        left = 0;
        right = k - 1;

        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        } //reverse 0 to K-1 index

        left = k;
        right = N - 1;

        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        } //reverse 0 to K-1 index

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}
