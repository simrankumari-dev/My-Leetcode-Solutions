class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length();
        if (m + n != s3.length()) return false;

        // ensure we use the smaller string for the DP dimension
        if (n < m) {
            // swap so that n >= m (makes dp array smaller)
            return isInterleave(s2, s1, s3);
        }

        // dp[j] corresponds to dp[i][j] for current i
        boolean[] dp = new boolean[n + 1];

        dp[0] = true; // dp[0][0]
        // initialize first row (i = 0)
        for (int j = 1; j <= n; j++) {
            dp[j] = dp[j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }

        for (int i = 1; i <= m; i++) {
            // update dp[0] for current i (j = 0)
            dp[0] = dp[0] && s1.charAt(i - 1) == s3.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                int k = i + j - 1; // index in s3
                boolean fromS1 = dp[j] && s1.charAt(i - 1) == s3.charAt(k); // dp[j] was dp[i-1][j]
                boolean fromS2 = dp[j - 1] && s2.charAt(j - 1) == s3.charAt(k); // dp[j-1] is dp[i][j-1]
                dp[j] = fromS1 || fromS2;
            }
        }
        return dp[n];
    }
}
