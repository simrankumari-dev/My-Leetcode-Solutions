import java.util.*;

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums); // Step 1: sort the array
        for (int i = 0; i < nums.length; i += 2) {
            // Step 2: swap pairs
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }
}
