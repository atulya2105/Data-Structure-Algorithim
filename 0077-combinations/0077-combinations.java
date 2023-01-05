class Solution {
    List<List<Integer>>ans = new ArrayList<>();
    void helper(int idx, int k, int n, ArrayList<Integer> ls){
        if(k==0){
            ArrayList<Integer> sol = new ArrayList<Integer>(ls);
            ans.add(sol);
            return;
        }
        for(int i = idx;i<=n;i++){
            ls.add(i);
            helper(i+1,k-1,n,ls);
            ls.remove(ls.size()-1);
        }
        return;
    }
    
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> ls = new ArrayList<>();
        helper(1,k,n,ls);
        return ans;
    }
}