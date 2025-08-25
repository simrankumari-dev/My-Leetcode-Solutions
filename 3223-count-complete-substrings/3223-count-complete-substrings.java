class Solution {
    public int countCompleteSubstrings(String word, int k) {
        int n = word.length();
        int ans = 0;

        // Step 1: split into valid segments where diff between adjacent chars <= 2
        int start = 0;
        for (int i = 1; i <= n; i++) {
            if (i == n || Math.abs(word.charAt(i) - word.charAt(i - 1)) > 2) {
                ans += countInSegment(word.substring(start, i), k);
                start = i;
            }
        }

        return ans;
    }

    private int countInSegment(String s, int k) {
        int n = s.length();
        int ans = 0;

        // max distinct characters in a valid substring
        for (int unique = 1; unique <= 26; unique++) {
            int len = unique * k;
            if (len > n) break;

            int[] freq = new int[26];
            int distinct = 0;

            // sliding window
            for (int i = 0; i < n; i++) {
                int idx = s.charAt(i) - 'a';
                freq[idx]++;
                if (freq[idx] == 1) distinct++;

                if (i >= len) {
                    int leftIdx = s.charAt(i - len) - 'a';
                    freq[leftIdx]--;
                    if (freq[leftIdx] == 0) distinct--;
                }

                if (i + 1 >= len && distinct == unique && allKTimes(freq, k)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private boolean allKTimes(int[] freq, int k) {
        for (int f : freq) {
            if (f != 0 && f != k) return false;
        }
        return true;
    }
}
