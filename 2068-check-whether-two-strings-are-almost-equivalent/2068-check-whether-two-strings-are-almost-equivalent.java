class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if(m!=n)
            return false;
        int[] freq = new int[26];
        for(int i = 0;i<n;i++){
            freq[word1.charAt(i)-'a']++;
        }
        for(int i = 0;i<m;i++){
            freq[word2.charAt(i)-'a']--;
        }
        // int cnt = 0;
        
        for(int i = 0;i<26;i++){
            if(Math.abs(freq[i])>3){
                return false;
            }
        }
        // if(cnt!=0)
        //     return false;
        return true;
    }
}