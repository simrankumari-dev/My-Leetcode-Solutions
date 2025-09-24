class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int consecutiveOdds = 0; // Counter for consecutive odd numbers

        for (int num : arr) {
            // Check if the current number is odd
            if (num % 2 != 0) {
                consecutiveOdds++; // If it's odd, increment the counter
            } else {
                consecutiveOdds = 0; // If it's even, reset the counter
            }

            // Check if we have found three consecutive odd numbers
            if (consecutiveOdds == 3) {
                return true; // If so, we can immediately return true
            }
        }

        // If the loop finishes without finding three consecutive odds, return false
        return false;
    }
}