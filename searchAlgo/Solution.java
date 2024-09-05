public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 3;
        System.out.println("Index of target1: " + solution.search(nums1, target1));  // Output: 2

        // Example 2
        int[] nums2 = {1, 2, 3, 4, 5};
        int target2 = 6;
        System.out.println("Index of target2: " + solution.search(nums2, target2));  // Output: -1

        // Example 3
        int[] nums3 = {1, 3, 5, 7, 9};
        int target3 = 7;
        System.out.println("Index of target3: " + solution.search(nums3, target3));  // Output: 3

        // Example 4
        int[] nums4 = {1, 3, 5, 7, 9};
        int target4 = 2;
        System.out.println("Index of target4: " + solution.search(nums4, target4));  // Output: -1
    }
}