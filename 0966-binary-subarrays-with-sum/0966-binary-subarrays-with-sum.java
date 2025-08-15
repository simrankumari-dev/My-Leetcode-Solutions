import java.util.*;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Prefix sum 0 appears once
        
        int sum = 0, count = 0;
        
        for (int num : nums) {
            sum += num;
            
            // If (sum - goal) exists, add its frequency to count
            if (prefixSumCount.containsKey(sum - goal)) {
                count += prefixSumCount.get(sum - goal);
            }
            
            // Update prefix sum frequency
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
