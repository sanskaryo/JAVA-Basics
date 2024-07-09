class Solution {
    public int search(int[] nums, int target) {
        int st = 0, end = nums.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // pahle check karte h left half sorted or not
            // if start <= mid then its sorted
            if (nums[st] <= nums[mid]) {
                // ab check karenge ki target left half m h ya nhi 
                if (nums[st] <= target && target < nums[mid]) {
                    end = mid - 1;
                    // target left m h to end ko mid se pahle 
                } else {
                    st = mid + 1;
                }
            } else {
                // similarly  right half is sorted
                // Checking if the target is in the right half
                if (nums[mid] < target && target <= nums[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;  //  agar Target not found
    }
}
