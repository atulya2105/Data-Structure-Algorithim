class Solution {
    public long countGood(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        long ans = 0;
        int pairs = 0;
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            pairs += hm.getOrDefault(nums[i],0);
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(pairs>=k){
                while(j<i && pairs>=k){
                    ans += (nums.length - i);
                    hm.put(nums[j],hm.get(nums[j])-1);
                    pairs -= hm.getOrDefault(nums[j],0);
                    if(hm.get(nums[j])==0)
                        hm.remove(nums[j]);
                     j++;
                 }
                
            }
        }
        return ans;
    }
}