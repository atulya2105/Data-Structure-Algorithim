class Solution {
    public int longestOnes(int[] nums, int k) {
         int zerocnt = 0;
        int j = 0;
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                zerocnt++;
            }
            
            while(zerocnt>k){
                if(nums[j]==0){
                    zerocnt--;
                }
                j++;
            }
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
}