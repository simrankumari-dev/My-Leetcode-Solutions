import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        
        // Square each element
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }
        
        // Sort the squared values
        Arrays.sort(nums);
        
        return nums;
    }
}
