class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        // count characters in magazine
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        // check characters in ransomNote
        for (char c : ransomNote.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
