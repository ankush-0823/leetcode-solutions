public class Solution {
    public int matrixScore(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int res = (1 << (COLS - 1)) * ROWS; // Equivalent to (2 ** (COLS - 1)) * ROWS in Python
        
        for (int r = 0; r < ROWS; r++) {
            if (grid[r][0] == 0) {
                for (int c = 0; c < COLS; c++) {
                    grid[r][c] = grid[r][c] == 0 ? 1 : 0;
                }
            }
        }
        
        for (int c = 1; c < COLS; c++) {
            int count1 = 0;
            for (int r = 0; r < ROWS; r++) {
                if (grid[r][c] == 1) {
                    count1++;
                }
            }
            if (count1 > (ROWS / 2)) {
                res += count1 * (1 << (COLS - c - 1)); // Equivalent to (2 ** (COLS - c - 1)) in Python
            } else {
                res += (ROWS - count1) * (1 << (COLS - c - 1)); // Equivalent to (2 ** (COLS - c - 1)) in Python
            }
        }
        
        return res;
    }
}