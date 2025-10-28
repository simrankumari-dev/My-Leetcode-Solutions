import java.util.*;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> path, List<String> result) {
        // If we have 4 parts and used all characters
        if (path.size() == 4 && start == s.length()) {
            result.add(String.join(".", path));
            return;
        }
        // If parts > 4 or characters finished early
        if (path.size() >= 4) return;

        // Try every segment length (1 to 3)
        for (int len = 1; len <= 3 && start + len <= s.length(); len++) {
            String part = s.substring(start, start + len);

            // Skip invalid segments (leading zero or > 255)
            if ((part.startsWith("0") && part.length() > 1) || Integer.parseInt(part) > 255)
                continue;

            path.add(part);
            backtrack(s, start + len, path, result);
            path.remove(path.size() - 1); // backtrack
        }
    }
}
