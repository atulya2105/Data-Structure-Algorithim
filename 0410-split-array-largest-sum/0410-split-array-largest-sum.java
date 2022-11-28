class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int i = 0;i<nums.length;i++){
            high += nums[i];
        }
        int ans  = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(possible(nums,mid,k)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
                
            }
           // System.out.print(ans);
        }
        return ans;
    }
    boolean possible(int[] nums, int mid, int k){
        int cnt = 1;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum += nums[i];
            }else{
                cnt++;
                if(cnt>k || nums[i]>mid){
                    return false;
                }
                sum = nums[i];
            }
        }
        return true;
    }
}