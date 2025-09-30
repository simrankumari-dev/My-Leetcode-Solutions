class Solution {
    public int jump(int[] nums) {
        int jumps = 0;       // minimum jumps needed
        int currentEnd = 0;  // farthest we can go with current jump
        int farthest = 0;    // farthest index reachable overall
        
        // We don’t check the last index because when we reach it, no more jumps are needed
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            
            // when we reach the end of current jump range
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        
        return jumps;
    }
}
