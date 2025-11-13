import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // if pattern char already mapped
            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) return false;
            } 
            // if word already mapped to different char
            else if (reverseMap.containsKey(word)) {
                if (reverseMap.get(word) != c) return false;
            } 
            // make new mapping
            else {
                map.put(c, word);
                reverseMap.put(word, c);
            }
        }

        return true;
    }
}
