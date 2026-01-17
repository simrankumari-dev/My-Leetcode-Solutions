import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        // Step 1: Count frequency of each number
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check if frequencies are unique
        HashSet<Integer> freqSet = new HashSet<>();
        for (int freq : freqMap.values()) {
            if (freqSet.contains(freq)) {
                return false; // duplicate frequency found
            }
            freqSet.add(freq);
        }

        return true;
    }
}
