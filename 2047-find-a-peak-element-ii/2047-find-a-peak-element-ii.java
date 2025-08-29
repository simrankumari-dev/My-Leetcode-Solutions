class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int left = 0, right = cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Find row with max element in this column
            int maxRow = 0;
            for (int r = 0; r < rows; r++) {
                if (mat[r][mid] > mat[maxRow][mid]) {
                    maxRow = r;
                }
            }

            boolean leftBig = (mid - 1 >= 0) && (mat[maxRow][mid - 1] > mat[maxRow][mid]);
            boolean rightBig = (mid + 1 < cols) && (mat[maxRow][mid + 1] > mat[maxRow][mid]);

            if (!leftBig && !rightBig) {
                return new int[]{maxRow, mid}; // found peak
            } else if (leftBig) {
                right = mid - 1; // search left
            } else {
                left = mid + 1; // search right
            }
        }
        return new int[]{-1, -1}; // should never reach
    }
}
