class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char c : tasks) {
            freq[c - 'A']++;
        }

        Arrays.sort(freq);
        int f_max = freq[25]; // highest frequency

        // count how many tasks have frequency == f_max
        int count_max = 0;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == f_max) count_max++;
            else break;
        }

        int partCount = f_max - 1;
        int partLength = n + 1;
        int minLen = partCount * partLength + count_max;

        return Math.max(tasks.length, minLen);
    }
}
