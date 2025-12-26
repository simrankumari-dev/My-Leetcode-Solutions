class Solution {
    public int lengthOfLastWord(String s) {
        // Step 1: Remove trailing spaces
        s = s.trim();

        // Step 2: Find the last index of space
        int lastSpaceIndex = s.lastIndexOf(" ");

        // Step 3: Last word length = total length - last space position - 1
        return s.length() - lastSpaceIndex - 1;
    }
}