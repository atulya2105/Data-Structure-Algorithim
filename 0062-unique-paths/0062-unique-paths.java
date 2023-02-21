class Solution {
    
    //memorization method
    int uniquePath(int m,int n,int[][] dp){
        if(m==0 && n==0)
            return 1;
        if(m<0 || n<0)
            return 0;
        if(dp[m][n] != 0)
            return dp[m][n];
        int up = uniquePath(m-1,n,dp);
        int left = uniquePath(m,n-1,dp);
        return dp[m][n] = up + left;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        // return uniquePath(m-1,n-1,dp);
        
        // tabulation method to solve this question 
        
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                int up = 0;
                int left  = 0;
                if(i==0 && j == 0){
                    dp[i][j] = 1;
                }else{
                    if(i>0) 
                        up = dp[i-1][j];
                    if(j>0)
                        left = dp[i][j-1];
                    dp[i][j] = up+left;
                }
            }
        }
        return dp[m-1][n-1];
    }
}