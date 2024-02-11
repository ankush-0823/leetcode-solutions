class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][][] t = new int[71][71][71];

        // t[row][c1][c2] = max cherries that can be collected till (row, c1) by robot1 and (row, c2) by robot2
        // return max in last row

        // For first row (robot1 is in 0th column) and robot2 is in (n-1)th column
        t[0][0][n - 1] = (n == 1) ? grid[0][0] : grid[0][0] + grid[0][n - 1];

        for (int row = 1; row < m; row++) {
            for (int c1 = 0; c1 <= Math.min(n - 1, row); c1++) { // Math.min(n-1, row) - Explained in video
                for (int c2 = Math.max(0, n - 1 - row); c2 < n; c2++) { // Math.max(0, n-1-row) - Explained in video

                    int prevMax = 0;
                    // A Robot can come to the current column from either column-1, column, or column+1 of the previous row (row-1)
                    for (int column1 = Math.max(0, c1 - 1); column1 <= Math.min(n - 1, c1 + 1); column1++) {
                        for (int column2 = Math.max(0, c2 - 1); column2 <= Math.min(n - 1, c2 + 1); column2++) {
                            prevMax = Math.max(prevMax, t[row - 1][column1][column2]);
                        }
                    }

                    if (c1 == c2)
                        t[row][c1][c2] = prevMax + grid[row][c1];
                    else
                        t[row][c1][c2] = prevMax + grid[row][c1] + grid[row][c2];
                }
            }
        }

        int res = 0;
        // return max in the last row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res = Math.max(res, t[m - 1][i][j]);
            }
        }
        return res;
    }
}
