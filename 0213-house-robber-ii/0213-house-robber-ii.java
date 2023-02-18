class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp1 = new int[n-1];
        int[] dp2 = new int[n-1];
        int j = 0;
        int k = 0;
        for(int i = 0;i<n;i++){
            if(i!=0) dp1[j++] = nums[i];
            if(i!=n-1) dp2[k++]  = nums[i];
            // j++;
        }
        int first = helper(dp1);
        int second = helper(dp2);
        System.out.println(first +" "+ second);
        return Math.max(first,second);
    }
    
    int helper(int[] nums){
        int prev = nums[0];
        int prev2 = 0;
        for(int i = 1;i<nums.length;i++){
            int pick = nums[i];
            if(i>1) pick += prev2;
            int notPick = prev;
            int curr = Math.max(pick,notPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    
    
    
}