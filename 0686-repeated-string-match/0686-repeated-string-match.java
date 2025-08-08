class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        // Keep appending 'a' until length is at least 'b'
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        // Check if 'b' is a substring
        if (sb.toString().contains(b)) {
            return count;
        }

        // Append one more time in case 'b' spans over the boundary
        sb.append(a);
        count++;
        if (sb.toString().contains(b)) {
            return count;
        }

        // If still not found, return -1
        return -1;
    }
}
