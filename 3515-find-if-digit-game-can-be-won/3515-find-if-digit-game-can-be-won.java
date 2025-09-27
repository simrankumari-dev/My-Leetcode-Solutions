class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingles = 0, sumDoubles = 0, total = 0;

        for (int num : nums) {
            total += num;
            if (num < 10) {
                sumSingles += num;
            } else if (num < 100) {
                sumDoubles += num;
            }
        }

        int bobIfAliceSingle = total - sumSingles;
        int bobIfAliceDouble = total - sumDoubles;

        return (sumSingles > bobIfAliceSingle) || (sumDoubles > bobIfAliceDouble);
    }
}
