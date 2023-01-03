class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int allsum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            allsum += i*nums[i];
        }
        int mx = allsum;
        for(int i = nums.length-1;i>=1;i--){
            int curr = allsum + sum - nums.length*nums[i];
            mx = Math.max(curr,mx);
            allsum = curr;
        }
        return mx;
    }
}