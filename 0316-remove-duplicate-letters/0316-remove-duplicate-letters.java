class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        boolean[] used = new boolean[26];

        // store last index of each character
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (used[idx]) continue;

            // remove larger chars if they appear later
            while (stack.length() > 0) {
                char top = stack.charAt(stack.length() - 1);
                if (top > ch && last[top - 'a'] > i) {
                    used[top - 'a'] = false;
                    stack.deleteCharAt(stack.length() - 1);
                } else break;
            }

            stack.append(ch);
            used[idx] = true;
        }

        return stack.toString();
    }
}
