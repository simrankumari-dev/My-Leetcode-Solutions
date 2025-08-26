class Solution {
    public long maxArrayValue(int[] nums) {
        long result = 0;
        long current = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] <= current) {
                current += nums[i]; // merge
            } else {
                current = nums[i]; // reset
            }
            result = Math.max(result, current);
        }

        return Math.max(result, current);
    }
}
