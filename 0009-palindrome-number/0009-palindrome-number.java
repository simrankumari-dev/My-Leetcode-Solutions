class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers and numbers ending with 0 (but not 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int original = x;
        int reversed = 0;

        // Reverse the number
        while (x > 0) {
            int digit = x % 10;      // pick last digit
            reversed = reversed * 10 + digit; // add it to reversed
            x = x / 10;              // remove last digit
        }

        return original == reversed;
    }
}
