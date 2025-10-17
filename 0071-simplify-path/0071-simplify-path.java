class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String dir : parts) {
            if (dir.equals("") || dir.equals(".")) {
                continue; // ignore empty and current directory
            } else if (dir.equals("..")) {
                if (!stack.isEmpty()) stack.pop(); // go one level up
            } else {
                stack.push(dir); // valid directory name
            }
        }

        // build canonical path
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}
