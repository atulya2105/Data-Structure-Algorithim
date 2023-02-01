class Solution {
    int gcd(int a, int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int mn = nums[0];
        int mx = nums[0];
        for(int i= 0;i<nums.length;i++){
            mn = Math.min(mn,nums[i]);
            mx = Math.max(mx,nums[i]);
        }
        return gcd(mn,mx);
    }
}