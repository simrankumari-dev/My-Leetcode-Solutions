class Solution {
    public boolean isNumber(String s) {
        s = s.trim();  // remove leading/trailing spaces
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        boolean numAfterE = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                numSeen = true;
                if (eSeen) numAfterE = true;
            } 
            else if (c == '.') {
                if (dotSeen || eSeen) return false; // dot can appear only once and before 'e'
                dotSeen = true;
            } 
            else if (c == 'e' || c == 'E') {
                if (eSeen || !numSeen) return false; // 'e' must appear once and after a number
                eSeen = true;
                numAfterE = false; // reset, need digits after e
            } 
            else if (c == '+' || c == '-') {
                // sign must be at start or right after 'e'
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') 
                    return false;
            } 
            else {
                return false; // invalid character
            }
        }

        return numSeen && numAfterE;
    }
}
