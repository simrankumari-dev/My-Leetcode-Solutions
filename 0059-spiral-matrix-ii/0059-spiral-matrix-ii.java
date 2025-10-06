class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1; // Start filling from 1
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        
        while (top <= bottom && left <= right) {
            // 1. left -> right
            for (int i = left; i <= right; i++)
                matrix[top][i] = num++;
            top++;
            
            // 2. top -> bottom
            for (int i = top; i <= bottom; i++)
                matrix[i][right] = num++;
            right--;
            
            // 3. right -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    matrix[bottom][i] = num++;
                bottom--;
            }
            
            // 4. bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    matrix[i][left] = num++;
                left++;
            }
        }
        
        return matrix;
    }
}
