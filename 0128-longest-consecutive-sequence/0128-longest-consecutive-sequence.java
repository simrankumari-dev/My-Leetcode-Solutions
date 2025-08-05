import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // 1. Add all elements to HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // 2. Check only for sequence starters
        for (int num : set) {
            if (!set.contains(num - 1)) { // Only start counting if it's the beginning of a sequence
                int currentNum = num;
                int count = 1;

                // 3. Count the length of consecutive sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
