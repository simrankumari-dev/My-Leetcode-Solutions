class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;  // if length <= 2, nothing to remove

        int k = 2; // start from index 2 because first two elements are always valid

        for (int i = 2; i < n; i++) {
            // Compare current number with the number at position k-2
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
