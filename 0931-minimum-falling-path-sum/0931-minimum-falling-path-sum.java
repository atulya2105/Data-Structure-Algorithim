class Solution {
    int memo(int[][] arr,int i,int j,int[][] dp){
        
         if(j<0 || j>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==0)
            return arr[i][j];
       if(dp[i][j] != 0){
           return dp[i][j];
       }
        
        int up = arr[i][j] + memo(arr,i-1,j,dp);
        int leftD = arr[i][j] + memo(arr,i-1,j-1,dp);
        int rightD = arr[i][j] + memo(arr,i-1,j+1,dp);
        
        return dp[i][j] = Math.min(leftD,Math.min(up,rightD));
    }
    public int minFallingPathSum(int[][] A) {
        int dp[][] = new int[A.length][A.length];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++)
        {
            dp[0][i] = A[0][i];
        }
        for(int i = 1; i < A.length; i++)
        {
            for(int j = 0; j < A.length; j++)
            {
                if(j == 0)
                {
                    dp[i][j] = A[i][j] + Math.min(dp[i-1][j], dp[i-1][j+1]);
                }
                else if(j == A.length - 1)
                {
                    dp[i][j] = A[i][j] + Math.min(dp[i-1][j-1], dp[i-1][j]);
                }
                else
                {
                    dp[i][j] = A[i][j] + Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i-1][j+1]);
                }
            }
        }
        for(int i = 0; i < A.length; i++)
        {
            if(dp[A.length-1][i] < min)  min = dp[A.length-1][i];
        }
        return min;
    }
}