class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0, maxOpen = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                if (minOpen > 0) minOpen--;
                maxOpen--;
            } else { // '*'
                if (minOpen > 0) minOpen--; // treat as ')'
                maxOpen++; // treat as '('
            }
            
            if (maxOpen < 0) return false; // too many ')'
        }
        
        return minOpen == 0;
    }
}
