class Solution {
    public void genrate(String s, int open, int close, List<String> ans){
        if(open==0 && close==0){
            ans.add(s);
        }
        if(open!=0){
            String temp = s;
            temp += '(';
            genrate(temp,open-1,close,ans);
            //temp.replace(temp.charAt(temp.length()-1),"");
        }
        if(open<close){
            String temp = s;
            temp += ')';
            genrate(temp,open,close-1,ans);
            //temp.replace(temp.charAt(temp.length()-1),"");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        genrate("",n,n,ans);
        return ans;
    }
}