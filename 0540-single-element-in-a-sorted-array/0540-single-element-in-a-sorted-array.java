class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Ensure mid is even for pairing check
            if (mid % 2 == 1) {
                mid--;
            }

            // If the pair is valid, single element is on the right
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        // Left will point to the single element
        return nums[left];
    }
}
