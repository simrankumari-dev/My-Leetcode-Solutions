class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount = 0;  // how many numbers are missing
        int current = 1;       // start checking from 1
        int i = 0;             // pointer for arr
        
        while (missingCount < k) {
            if (i < arr.length && arr[i] == current) {
                // number exists in arr, move pointer
                i++;
            } else {
                // number is missing
                missingCount++;
                if (missingCount == k) {
                    return current;
                }
            }
            current++;
        }
        
        return -1; // should never reach here
    }
}
