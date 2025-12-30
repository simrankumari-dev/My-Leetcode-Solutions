class Solution {
    public String removeKdigits(String num, int k) {

        // Edge case
        if (k == num.length()) return "0";

        Stack<Character> stack = new Stack<>();

        for (char ch : num.toCharArray()) {

            // Remove larger digits from left
            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }

            stack.push(ch);
        }

        // If k still > 0, remove from end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build result
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
