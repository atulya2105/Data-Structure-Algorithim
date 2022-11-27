class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder("");
        StringBuilder temp = new StringBuilder("");
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==' ' && i<s.length()){
                temp.reverse();
                ans.append(temp);
                ans.append(' ');
                temp.setLength(0);           
                //if(s.length())
            }
            else{
                temp.append(ch);
            }
            
        }
        temp.reverse();
        ans.append(temp);
        return ans.toString();
    }
}