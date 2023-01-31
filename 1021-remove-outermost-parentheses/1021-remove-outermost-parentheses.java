class Solution {
    public String removeOuterParentheses(String s) {
         StringBuilder sb = new StringBuilder("");
        // Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(count!=0) sb.append(ch);
                count++;
            }else{
                if(count!=1) sb.append(ch);
                count--;
            }
        }
        return sb.toString();
    }
}