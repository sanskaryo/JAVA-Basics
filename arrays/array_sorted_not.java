import java.util.Scanner;

public class array_sorted_not {

    static boolean isSorted(int[] arr) {
    
        boolean check= true;
    
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] <arr[i-1]){
                check = false;   
                break;
            }

        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("enter   " + n + "  elements : ");
        for(int i = 0 ; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("enter x  ");
        // int x = sc.nextInt();
        System.out.println("Is your array Sorted -  " + isSorted(arr));
        sc.close();
    }


    
}
