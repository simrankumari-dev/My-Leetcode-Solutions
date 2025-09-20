class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            // If c is uppercase (A-Z), convert to lowercase
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32)); // ASCII conversion
            } else {
                result.append(c); // keep same
            }
        }
        return result.toString();
    }
}
