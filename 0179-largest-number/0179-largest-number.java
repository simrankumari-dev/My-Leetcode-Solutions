import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        // Step 1: Convert numbers to strings
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        
        // Step 2: Sort with custom comparator
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        
        // Step 3: Handle case with leading zeros
        if (arr[0].equals("0")) {
            return "0";
        }
        
        // Step 4: Join all strings
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        
        return sb.toString();
    }
}
