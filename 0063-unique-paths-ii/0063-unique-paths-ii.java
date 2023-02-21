class Solution {
    int memo(int[][] nums,int i,int j,int[][] dp){
        if(i>=0 && j>=0 && nums[i][j]==1)
            return 0;
        if(i==0 && j==0)
            return 1;
        if(i<0 || j<0)
            return 0;
        if(dp[i][j] !=0)
            return dp[i][j];
        int up = memo(nums,i-1,j,dp);
        int left = memo(nums,i,j-1,dp);
        return dp[i][j] = up+left;
            
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        
        // for(int i = 0;i<n;i++){
        //     for(int j = 0;j<m;j++){
        //         int up = 0;
        //         int left = 0;
        //         if(i>= 0 && j>=0 && obstacleGrid[i][j]==1)
        //             dp[i][j] =  0;
        //         else if(i==0 && j==0)
        //             dp[i][j] = 1;
        //         else{
        //             if(i>0)
        //                 up = dp[i-1][j];
        //             if(j>0)
        //                 left = dp[i][j-1];
        //             dp[i][j] = up+left;
        //         }
        //     }
        // }
        int[] prev = new int[m];
         for(int i = 0;i<n;i++){
             int[] curr = new int[m];
            for(int j = 0;j<m;j++){
                int up = 0;
                int left = 0;
                if(i>= 0 && j>=0 && obstacleGrid[i][j]==1)
                    curr[j] =  0;
                else if(i==0 && j==0)
                    curr[j] = 1;
                else{
                    if(i>0)
                        up = prev[j];
                    if(j>0)
                        left = curr[j-1];
                    curr[j] = up+left;
                }
            }
             prev = curr;
        }
        return prev[m-1];
    }
}