// time complexity 0(n^2)
public class buubleSort {

    public static void printarray(int arr[]) {
        for (int i = 0 ; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.err.println();
        
    }
    public static void main(String[] args) {
        int arr[] = {7,3,9,2,6,4,4,5,3};

        // bubble sort
        for(int i =0; i <arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        printarray(arr);
    }
}
