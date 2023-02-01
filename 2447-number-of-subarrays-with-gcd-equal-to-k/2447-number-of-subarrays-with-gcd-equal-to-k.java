class Solution {
    int getgcd(int a, int b){
        if(b==0)
            return a;
        else
            return getgcd(b,a%b);
    }
    public int subarrayGCD(int[] nums, int k) {
        int cnt = 0;
        // int gcd = 0;
        for(int i = 0;i<nums.length;i++){
            int gcd = nums[i];
            for(int j = i;j<nums.length;j++){
                gcd = getgcd(gcd,nums[j]);
                if(gcd==k)
                    cnt++;
                else if(gcd<k)
                    break;
            }
        }
        return cnt;
    }
}