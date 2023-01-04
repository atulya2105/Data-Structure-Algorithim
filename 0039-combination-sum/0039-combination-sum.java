class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void helper(int idx, int[] arr, int t,List<Integer>ls){
        if(t==0){
            List<Integer> sol = new ArrayList<>(ls);
            ans.add(sol);
            return;
                
        }
        if(idx==arr.length){
            return;
        }
        if(t<0){
            return;
        }
        // skip
        helper(idx+1,arr,t,ls);
        // continue
        ls.add(arr[idx]);
        helper(idx,arr,t-arr[idx],ls);
        ls.remove(ls.size()-1);
        return;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ls = new ArrayList<>();
        helper(0,candidates,target,ls);
        return ans;
    }
}