class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int pro = 1;
        int pro1 = 1;
        int n = nums.length;
        
        if(n ==3){
            return nums[0]*nums[1]*nums[2];
        }
        for(int i = 0;i<2;i++){
            pro1 = pro1 * nums[i];
        }
        pro1 = pro1 * nums[n-1];
        //cout<<nums[n-1]<<endl;
        for(int i = nums.length -1; i>=nums.length-3;i--){
            pro = pro * nums[i];
        }
        int mx = Math.max(pro,pro1);
        return mx;
    }
}