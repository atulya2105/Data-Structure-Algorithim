class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void helper(int i, List<Integer> ls,int k ,int t){
        if(t==0 && k==ls.size()){
            List<Integer> comb = new ArrayList<>(ls);
            ans.add(comb);
            return ;
        }
        for(int j = i;j<=9;j++){
            ls.add(j);
            helper(j+1,ls,k,t-j);
            ls.remove(ls.size()-1);
        }
        
        // for skipping the element
        
        return ;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> ls = new ArrayList<>();
        helper(1,ls,k,n);
        return ans;
    }
}