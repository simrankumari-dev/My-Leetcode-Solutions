class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        // Hexadecimal characters
        char[] map = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        
        // Use unsigned right shift for negative numbers
        while (num != 0 && sb.length() < 8) {
            sb.append(map[num & 15]); // Get last 4 bits
            num >>>= 4;               // Unsigned right shift by 4 bits
        }
        
        return sb.reverse().toString();
    }
}
