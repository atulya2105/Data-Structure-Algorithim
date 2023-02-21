class Solution {
    public int minimumTotal(List<List<Integer>> grid) {
        int n = grid.size();
		int[][] dp = new int[n][n];

		dp[0][0] = grid.get(0).get(0);
		for(int i = 0;i<n;i++){
			dp[n-1][i] = grid.get(n-1).get(i);
		}
		for(int i = n-2;i>=0;i--){
			for(int j = i;j>=0;j--){
				int down = grid.get(i).get(j) + dp[i+1][j];
				int dg = grid.get(i).get(j) + dp[i+1][j+1];
				dp[i][j] = Math.min(dg,down);
			}
		}
		return dp[0][0];
    }
}