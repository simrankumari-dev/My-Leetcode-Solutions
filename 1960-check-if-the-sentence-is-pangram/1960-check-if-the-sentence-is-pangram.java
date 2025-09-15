class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26]; // 26 letters
        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true; // mark letter as seen
        }
        for (boolean b : seen) {
            if (!b) return false; // if any letter missing
        }
        return true; // all letters found
    }
}
