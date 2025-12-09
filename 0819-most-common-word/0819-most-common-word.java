import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        // Convert banned list to HashSet for quick lookup
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        // Convert paragraph to lowercase and replace punctuation with space
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        // Split the paragraph into words
        String[] words = paragraph.split("\\s+");

        // HashMap to count frequency
        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (!bannedSet.contains(w)) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }

        // Find most frequent non-banned word
        String result = "";
        int max = 0;
        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }

        return result;
    }
}
