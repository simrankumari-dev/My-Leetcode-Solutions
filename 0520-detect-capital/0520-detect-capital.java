class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int upperCount = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCount++;
            }
        }

        // Case 1: All letters uppercase
        if (upperCount == n) return true;

        // Case 2: All letters lowercase
        if (upperCount == 0) return true;

        // Case 3: Only first letter uppercase
        if (upperCount == 1 && Character.isUpperCase(word.charAt(0))) return true;

        return false;
    }
}
