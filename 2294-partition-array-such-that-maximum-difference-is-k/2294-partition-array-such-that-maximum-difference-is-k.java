class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int first = 0;
        int cnt = 1;
        for(int i = 0;i<n;i++){
            if(nums[i]-nums[first]<=k) continue;
            cnt++;
            first = i;
        }
        return cnt;
    }
}