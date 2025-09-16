class Solution {
    public int countDigits(int num) {
        int original = num;   // store original number
        int count = 0;
        
        while (num > 0) {
            int digit = num % 10;  // get last digit
            if (digit != 0 && original % digit == 0) {
                count++;  // if digit divides original number
            }
            num /= 10;  // remove last digit
        }
        
        return count;
    }
}
