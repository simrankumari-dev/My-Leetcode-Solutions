class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int num : nums) {
            elementSum += num;

            // Calculate digit sum for current number
            int temp = num;
            while (temp > 0) {
                digitSum += temp % 10; // extract last digit
                temp /= 10;            // remove last digit
            }
        }

        // return absolute difference
        return Math.abs(elementSum - digitSum);
    }
}
