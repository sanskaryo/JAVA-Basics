public class sortedRotated {

    class Solution {
        public int search(int[] nums, int target) {
            int st = 0, end = nums.length - 1;

            while (st <= end) {
                int mid = st + (end - st) / 2;

                if (nums[mid] == target) {
                    return mid;
                }

                // Check karo agar left half sorted hai
                if (nums[st] <= nums[mid]) {
                    // Agar target left half mein hai
                    if (nums[st] <= target && target < nums[mid]) {
                        end = mid - 1;
                    } else {
                        st = mid + 1;
                    }
                } else {
                    // Right half sorted hai
                    // Agar target right half mein hai
                    if (nums[mid] < target && target <= nums[end]) {
                        st = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }

            return -1; // Target nahi mila
        }
    }

}
