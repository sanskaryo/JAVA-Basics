// { Driver Code Starts
/* package whatever // do not write package name here */

import java.io.*;
import java.util.*;

class nextgreater {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            long[] arr = new long[n];
            for(int i = 0; i < n; i++) arr[i] = Long.parseLong(inputLine[i]);
            long[] res = new Solution().nextLargerElement(arr, n);
            for (int i = 0; i < n; i++) 
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution {
    // Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n) { 
        Stack<Integer> st = new Stack<>();
        long res[] = new long[n];
        Arrays.fill(res, -1);
        
        for (int i = 0; i < n; i++) {
            long ele = arr[i];
            while (!st.isEmpty() && ele > arr[st.peek()]) {
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }
        
        return res;
    }
}
