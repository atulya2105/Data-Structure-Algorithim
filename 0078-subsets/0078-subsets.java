class Solution {
    void helper(int[] nums,List<List<Integer>> ans, List<Integer> temp,int idx){
//         if(idx<nums.length){
           
//             return;
//         }
         List<Integer> res = new ArrayList<>(temp);
        ans.add(res);
        // if(idx==nums.length){
        //     return ;
        // }
        for(int i = idx;i<nums.length;i++){
            temp.add(nums[i]);
            helper(nums,ans,temp,i+1);
            temp.remove(temp.size()-1);
        }
        
        // helper(nums,ans,temp,idx+1);
        return;
        
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,ans,temp,0);
        return ans;
    }
}