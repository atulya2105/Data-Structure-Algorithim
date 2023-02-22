class Solution {
    int memo(int[][] grid, int i,int j,int[][] dp){
        if(j<0 || j>=grid[0].length)
            return Integer.MAX_VALUE;
        if(i==0) return grid[i][j];
        
        int mn = Integer.MAX_VALUE;
        
        for(int k = 0;k<grid[0].length;k++){
            if(k==j){
                continue;
            }
            mn = Math.min(mn,grid[i][j] + memo(grid,i-1,k,dp));
            dp[i][j] = mn;
            // System.out.print(mn+" ");
        }
        return dp[i][j];
    }
    public int minFallingPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mn = Integer.MAX_VALUE;
        int[][] dp = new int[m][n];
        for(int j = 0;j<n;j++){
            dp[0][j] = grid[0][j];
        }
        
        for(int i = 1;i<m;i++){
            for(int j = 0;j<n;j++){
                int ans = Integer.MAX_VALUE;
                for(int k = 0; k < n; k++){
                    if(j == k)
                        continue;
                     ans = Math.min(ans, dp[i - 1][k] + grid[i][j]);
                }
                dp[i][j] = ans;
            }
        }
        
        for(int j = 0;j<n;j++){
            mn = Math.min(mn,dp[m-1][j]);
        }
        return mn;
    }
}