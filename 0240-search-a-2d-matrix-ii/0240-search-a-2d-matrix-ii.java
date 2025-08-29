class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from top-right corner
        int r = 0, c = cols - 1;

        while (r < rows && c >= 0) {
            if (matrix[r][c] == target) {
                return true; // found
            } else if (matrix[r][c] > target) {
                c--; // move left
            } else {
                r++; // move down
            }
        }
        return false; // not found
    }
}
