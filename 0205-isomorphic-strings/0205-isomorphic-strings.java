class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] lastS = new int[256]; // For characters in s
        int[] lastT = new int[256]; // For characters in t

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If previous positions don't match, mapping fails
            if (lastS[c1] != lastT[c2]) {
                return false;
            }

            // Mark current position (+1 to avoid confusion with default 0)
            lastS[c1] = i + 1;
            lastT[c2] = i + 1;
        }

        return true;
    }
}
