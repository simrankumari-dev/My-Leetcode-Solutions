class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int result = 0;

        // Start index of substring
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26]; // frequency of characters

            // End index of substring
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                int maxFreq = 0, minFreq = Integer.MAX_VALUE;

                // Check frequencies for beauty calculation
                for (int f : freq) {
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }

                result += (maxFreq - minFreq);
            }
        }
        return result;
    }
}
