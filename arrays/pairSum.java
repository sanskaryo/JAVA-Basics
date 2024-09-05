import java.util.Scanner;
public class pairSum {

    static int pairSum (int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for(int i =0 ; i<n; i++ ) {
            for(int j=i+1 ; j<n; j++){
                for(int k=i+2; k<n ; k++ ){

                
                if(arr[i] + arr[j] + arr[k] == target ){
                    ans++;
                }


        }
    }
   
}
return ans;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter array size");
        int n = sc.nextInt();


        int[] arr = new int[n];

        System.out.println("Enter " + n + "elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target sum");
        int target = sc.nextInt();

        System.out.println(pairSum(arr, target));


    }

}
