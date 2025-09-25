class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;
        
        for (int num : nums) {
            if (num == 0) return 0;       // product becomes 0
            if (num < 0) negativeCount++; // count negatives
        }
        
        return (negativeCount % 2 == 0) ? 1 : -1;
    }
}
