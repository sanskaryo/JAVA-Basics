public class NextGre {

    public static void main(String[] args) {
        int [] arr = {1,2,3,6,2,6,2,9};
        int [] res = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            res[i] = -1;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] < arr[j]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }
        for(int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println(" ");
        for(int i =0; i<res.length;i++) {
            System.out.print(res[i] + " ");
        }

        }
    }
    
