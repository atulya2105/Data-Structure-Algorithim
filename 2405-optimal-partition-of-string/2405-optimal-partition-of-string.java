class Solution {
    public int partitionString(String s) {
        HashSet<Character> hs = new HashSet<>();
        int cnt = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hs.contains(ch)){
                cnt++;
                hs.clear();
                
            }
             hs.add(ch);
            
        }
        return cnt+1;
    }
}