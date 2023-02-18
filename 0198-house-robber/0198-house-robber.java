class Solution {
    public int rob(int[] nums) {
    //     int prevNo = 0;
    // int prevYes = 0;
    // for (int n : nums) {
    //     int temp = prevNo;
    //     prevNo = Math.max(prevNo, prevYes);
    //     prevYes = n + temp;
    // }
    // return Math.max(prevNo, prevYes);
        // Memorization method
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,nums.length-1,dp);
    }
    int helper(int[] nums, int idx,int[] dp){
        if(idx==0) return nums[idx];
        if(idx<0) return 0;
        if(dp[idx]!=-1)
            return dp[idx];
        int pick = nums[idx] + helper(nums,idx-2,dp);
        int notPick = helper(nums,idx-1,dp);
        dp[idx] = Math.max(pick,notPick);
        return dp[idx];
    }
}