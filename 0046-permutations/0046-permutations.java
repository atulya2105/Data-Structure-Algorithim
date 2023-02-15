class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        solve(nums,ans,temp,0,new int[nums.length]);
        return ans;
    }
    void solve(int[] nums, List<List<Integer>> ans, ArrayList<Integer> temp, int idx ,int[] boxes){
        if(idx==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i = 0;i<nums.length;i++){
            if(boxes[i]!=1){
                boxes[i] = 1;
                temp.add(nums[i]);
                solve(nums,ans,temp,idx+1,boxes);
                boxes[i] = 0;
                temp.remove(temp.size()-1);
                    
            }
        }
    }
}