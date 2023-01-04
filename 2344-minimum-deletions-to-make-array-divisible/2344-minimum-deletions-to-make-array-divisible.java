class Solution {
    public int minOperations(int[] nums, int[] nd) {
     
        int hcf = nd[0];
        for(int i=0; i<nd.length; i++){
            hcf = gcd(hcf,nd[i]);   
        }
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if(hcf%nums[i]==0)return i;
        }
        return -1;
        
    }
    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}