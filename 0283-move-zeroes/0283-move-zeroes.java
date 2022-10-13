class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        for(j = 0;j<nums.length;j++){
            if(nums[j]!=0){
                int x = nums[i];
                nums[i] = nums[j];
                nums[j] = x;
                i++;
            }
        }
    }
}