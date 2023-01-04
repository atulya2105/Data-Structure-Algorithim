class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void helper(int idx, int[] arr, int t,List<Integer>ls){
        if(t==0){
            List<Integer> sol = new ArrayList<>(ls);
            ans.add(sol);
            return;
                
        }
        for(int i = idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>t){
                break;
            }
            ls.add(arr[i]);
            helper(i+1,arr,t-arr[i],ls);
            ls.remove(ls.size()-1);
        }
        return ;
       
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,candidates,target,ls);
        return ans;
    }
}