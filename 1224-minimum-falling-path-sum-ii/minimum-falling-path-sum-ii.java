class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        // Create a DP table to store the minimum falling path sum for each position
        int[][] dp = new int[n][m];
        
        // Initialize the DP table with the values of the first row (as they are)
        for (int j = 0; j < m; j++) {
            dp[0][j] = grid[0][j];
        }
        
        // Start from the second row and fill the DP table bottom-up
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Initialize the current cell with the value from the grid
                dp[i][j] = grid[i][j];
                
                // Update the current cell with the minimum value from the previous row
                // excluding the current column
                int min_prev = Integer.MAX_VALUE;
                for (int k = 0; k < m; k++) {
                    if (k != j) {
                        min_prev = Math.min(min_prev, dp[i - 1][k]);
                    }
                }
                dp[i][j] += min_prev;
            }
        }
        
        // Find the minimum falling path sum in the last row of the DP table
        int min_sum = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            min_sum = Math.min(min_sum, dp[n - 1][j]);
        }
        
        return min_sum;
    }
}
