class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character,Integer> st = new HashMap<>();
        int i =-1;
        int j = -1;
        int len = 0;
        int ans= 0;
        while(true){
            boolean f1= false;
            boolean f2 = false;
            while(i<s.length()-1){
                f1 = true;
                i++;
                char ch = s.charAt(i);
                st.put(ch,st.getOrDefault(ch,0)+1);
                if(st.get(ch)>1){
                    break;
                }else{
                    len = i-j;
                    if(len>ans) ans = len;
                }
            }
            while(j<i){
                f2 = true;
                j++;
                char ch = s.charAt(j);
                
                st.put(ch,st.get(ch)-1);
                if(st.get(ch)==1) break;
            }
            if(f1==false&& f2 == false)break;
        }
        
        return ans;
        
    }
}