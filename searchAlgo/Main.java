class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;  // Peak is in the left half
            } else {
                left = mid + 1;  // Peak is in the right half
            }
        }

        return left;  // Or return right, both are the same
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Peak element index for nums1: " + solution.findPeakElement(nums1));  // Output: 2

        // Example 2
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Peak element index for nums2: " + solution.findPeakElement(nums2));  // Output: 5

        // Example 3
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("Peak element index for nums3: " + solution.findPeakElement(nums3));  // Output: 4

        // Example 4
        int[] nums4 = {5, 4, 3, 2, 1};
        System.out.println("Peak element index for nums4: " + solution.findPeakElement(nums4));  // Output: 0
    }
}
