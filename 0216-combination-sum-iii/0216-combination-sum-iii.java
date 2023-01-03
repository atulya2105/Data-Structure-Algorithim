class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void helper(int i, List<Integer> ls,int k ,int t){
        if(t==0 && k==ls.size()){
            List<Integer> comb = new ArrayList<>(ls);
            ans.add(comb);
            return ;
        }
        // for(int j = i;j<=9;j++){
        //     ls.add(j);
        //     helper(j+1,ls,k,t-j);
        //     ls.remove(ls.size()-1);
        // }
        if(i==10){
            return ;
            
        }
        if(k<0 || t<0){
            return ;
        }
        
        // for skipping the element
        helper(i+1,ls,k,t);
        
        // for including the element in the list
        ls.add(i);
        helper(i+1,ls,k,t-i);
        ls.remove(ls.size()-1);
        
       
        
        return ;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> ls = new ArrayList<>();
        helper(1,ls,k,n);
        return ans;
    }
}