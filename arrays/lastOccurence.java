import java.util.Scanner;

public class lastOccurence {
    static int lastOccurence(int[] arr , int x ){
        int lastidx = -1;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == x){
                lastidx = i;
            }
            lastidx = -1;
        }
        return lastidx ;
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
        System.out.println("enter x  ");
        int x = sc.nextInt();
        System.out.println("last occurence of x is  x is " + lastOccurence(arr, x));
    }
    
}
