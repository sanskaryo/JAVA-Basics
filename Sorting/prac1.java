// zeros to the end  wala ques 

public class prac1 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0, 5};
        int n = arr.length;

        for(int i =0;i<n-1; i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] ==0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int val : arr) {
            System.out.print(val + " ");

        }
    }
}

