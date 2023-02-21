class Solution {
    int memo(int[][] arr, int i, int j,int[][] dp){
		if(i==0 && j==0)
			return arr[0][0];
		if(i<0 || j<0)
			return Integer.MAX_VALUE;
		if(dp[i][j] !=0)
			return dp[i][j];
		int up = arr[i][j] + memo(arr,i-1,j,dp);
		int left = arr[i][j] + memo(arr,i,j-1,dp);
		return dp[i][j] = Math.min(up,left);
	}
    public int minPathSum(int[][] arr) {
        int m = arr.length;
		int n = arr[0].length;
		int[][] dp = new int[m][n];
		// for(int i = 0;i<m;i++){
		// 	for(int j = 0;j<n;j++){
		// 		int up = Integer.MAX_VALUE;
		// 		int left = Integer.MAX_VALUE;
		// 	    if(i==0 && j==0){
		// 			dp[i][j] = arr[i][j];
		// 		}else{
		// 			if(i>0){
		// 				up = arr[i][j] + dp[i-1][j];
		// 			}
		// 			if(j>0){
		// 				left = arr[i][j] + dp[i][j-1];
		// 			}
		// 			dp[i][j] = Math.min(up,left);
		// 		}
		// 	}
		// }
        int[] prev = new int[n];
        for(int i = 0;i<m;i++){
            int[] curr = new int[n];
			for(int j = 0;j<n;j++){
				int up = Integer.MAX_VALUE;
				int left = Integer.MAX_VALUE;
			    if(i==0 && j==0){
					curr[j] = arr[i][j];
				}else{
					if(i>0){
						up = arr[i][j] + prev[j];
					}
					if(j>0){
						left = arr[i][j] + curr[j-1];
					}
					curr[j] = Math.min(up,left);
				}
			}
            prev = curr;
		}
		
		return prev[n-1];
    }
}