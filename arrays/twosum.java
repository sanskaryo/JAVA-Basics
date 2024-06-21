
//gives index of nos whose sum is equal to target variable , 10+14 = 24


public class twosum {

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 ,5,10,14,16,1,23};
        int target = 24;

        for (int left =0;left<arr.length;left++) {

            for(int tick=left+1;tick<arr.length; tick++) {
                if(arr[left]+arr[tick]==target) {
                    System.out.println(left+" "+tick);
                }
               
            }
        }
    }
    
}

//optimised two pointer approach

// Java program to check if given array
// has 2 elements whose sum is equal
// to the given value
// import java.util.*;

// class GFG {
//     // Function to check if array has 2 elements
//     // whose sum is equal to the given value
//     static boolean hasArrayTwoCandidates(
//         int A[],
//         int arr_size, int sum)
//     {
//         int l, r;

//         /* Sort the elements */
//         Arrays.sort(A);

//         /* Now look for the two candidates 
//         in the sorted array*/
//         l = 0;
//         r = arr_size - 1;
//         while (l < r) {
//             if (A[l] + A[r] == sum)
//                 return true;
//             else if (A[l] + A[r] < sum)
//                 l++;
//             else // A[i] + A[j] > sum
//                 r--;
//         }
//         return false;
//     }

//     // Driver code
//     public static void main(String args[])
//     {
//         int A[] = { 1, 4, 45, 6, 10, -8 };
//         int n = 16;
//         int arr_size = A.length;

//         // Function calling
//         if (hasArrayTwoCandidates(A, arr_size, n))
//             System.out.println("Array has two "
//                                + "elements with given sum");
//         else
//             System.out.println("Array doesn't have "
//                                + "two elements with given sum");
//     }
// }

