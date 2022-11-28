class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int i= 0;i<weights.length;i++){
            high = high + weights[i];
        }
        int ans = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(possible(weights,mid,days)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    boolean possible(int[] nums, int mid, int d){
        int cnt = 1;
        int w = 0;
        for(int i = 0;i<nums.length;i++){
            if(w + nums[i]<=mid){
                w += nums[i];
            }else{
                cnt++;
                if(cnt>d || nums[i]>mid){
                    return false;
                }
                w = nums[i];
            }
        }
        return true;
    }
}