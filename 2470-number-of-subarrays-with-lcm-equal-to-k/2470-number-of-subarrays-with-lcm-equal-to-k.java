class Solution {
    public int subarrayLCM(int[] nums, int k) {
      int res = 0;
      int n = nums.length;
      for(int i=0; i<nums.length; i++){
          int currLcm = 1;
          for(int j=i; j<n; j++){
              currLcm = lcm(currLcm, nums[j]);

              if(currLcm==k)
                  res++;
              else if(currLcm>k)
                  break;
          }   
      }
      return res;
    }
    public static int lcm(int a, int b){
      return (a * b) / gcd(a,b);
    }
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }  
    
}