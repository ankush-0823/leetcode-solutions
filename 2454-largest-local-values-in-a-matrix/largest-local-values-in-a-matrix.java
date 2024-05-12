class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
       int mat[][]=new int[n-2][n-2];
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n-2;i++){
        for(int j=0;j<n-2;j++){
        mat[i][j]=findLocalMax(grid,i,j);
        }
       }
     return mat;
    }

    public int findLocalMax(int [][]grid,int row,int col){
        int max=Integer.MIN_VALUE;
        for(int i=row;i<=row+2;i++){
            for(int j=col;j<=col+2;j++){
                max=Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
}