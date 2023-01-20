class Solution {
     private List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        helper(nums, 0, new ArrayList<>());
        return result;
    }
    
    private void helper(int[] nums, int index, List<Integer> ans) {
        if (index > nums.length - 1) {
            if (ans.size() > 1) result.add(new ArrayList<>(ans));
            return;
        } 
        
        if (ans.isEmpty() || nums[index] >= ans.get(ans.size() - 1)) {
            ans.add(nums[index]);
            helper(nums, index + 1, ans);
            ans.remove(ans.size() - 1);
        }
        
        // repeated value, so don't need to drill down.
        if (index > 0 
            && ans.size() > 0 
            && nums[index] == ans.get(ans.size() - 1)) {
            return;
        }
        helper(nums, index + 1, ans);
    }
}