class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int mx = nums[0]+nums[1]+nums[2];
        for(int i = 0;i<n-2;i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum==target) return sum;
                if(Math.abs(sum-target)<Math.abs(target-mx)){
                    mx = sum;
                }
                if(sum>target){
                   
                    r--;
                }else{
                    
                    l++;
                }
            }
            while(i<n-2 && nums[i]==nums[i+1])
                i++;
        }
        return mx;
    }
}