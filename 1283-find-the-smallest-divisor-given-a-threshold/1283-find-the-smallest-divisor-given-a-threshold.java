class Solution {
     public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = nums[0];
        for(int i = 0;i<nums.length;i++){
            high = Math.max(high,nums[i]);
        }
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(nums,mid,threshold)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    boolean isPossible(int[] nums, int k, int th){
        //int cnt = 1;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
           sum += nums[i]/k;
            if(nums[i]%k!=0){
                sum++;
            }
            
        }
        return sum<=th;
    }
}