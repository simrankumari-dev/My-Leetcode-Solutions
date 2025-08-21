class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        
        // Step 1: calculate total sum
        for (int point : cardPoints) {
            totalSum += point;
        }
        
        // Step 2: window size = n - k
        int windowSize = n - k;
        int currSum = 0;
        
        // Step 3: first window sum
        for (int i = 0; i < windowSize; i++) {
            currSum += cardPoints[i];
        }
        
        int minWindowSum = currSum;
        
        // Step 4: slide window
        for (int i = windowSize; i < n; i++) {
            currSum += cardPoints[i] - cardPoints[i - windowSize];
            minWindowSum = Math.min(minWindowSum, currSum);
        }
        
        // Step 5: max score = totalSum - minWindowSum
        return totalSum - minWindowSum;
    }
}
