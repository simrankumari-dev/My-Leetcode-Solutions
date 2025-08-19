class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0; // count of unmatched '('
        int add = 0;  // count of extra ')' we need to add
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else { // c == ')'
                if (open > 0) {
                    open--; // match one '('
                } else {
                    add++; // need one '(' before this ')'
                }
            }
        }
        
        // open = extra '(' left unmatched
        return add + open;
    }
}
