
public class missingno {

    public static void main(String[] args) {
        int nums [] = {3,0,1,4,2,7,5};
        System.out.println(missing(nums));
        
    }


    public static int missing (int nums[]) {

        int sum = 0 ;
        for(int i =0;i<nums.length;i++)
        {
            sum = sum+nums[i];
        }
        int actualsum = (nums.length*(nums.length+1))/2;
        int missingn = actualsum - sum;
        return missingn;
    }

}