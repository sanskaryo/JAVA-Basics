class peakele {
    public int PeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;  // mid right se bada h ,to peak left half m hoga
            } else {
                left = mid + 1;  //  varna peak right half m hoga 
            }
        }

        return left;  // Or return right bcz both are the same
    }
}