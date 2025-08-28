class Solution {
    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        
        // Step 1: Copy array for modification
        int[] sorted = new int[n];
        int idx = 0;

        int i = 0;
        while (i < n) {
            int j = i;
            // Find segment with same set bit count
            int bits = Integer.bitCount(nums[i]);
            while (j < n && Integer.bitCount(nums[j]) == bits) {
                j++;
            }
            // Sort this segment
            int[] segment = new int[j - i];
            for (int k = i; k < j; k++) {
                segment[k - i] = nums[k];
            }
            Arrays.sort(segment);
            for (int k = 0; k < segment.length; k++) {
                sorted[idx++] = segment[k];
            }
            i = j;
        }

        // Step 2: Check if globally sorted
        for (i = 1; i < n; i++) {
            if (sorted[i] < sorted[i - 1]) return false;
        }
        return true;
    }
}
