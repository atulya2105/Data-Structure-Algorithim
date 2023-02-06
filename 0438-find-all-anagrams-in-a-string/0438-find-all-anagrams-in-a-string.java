class Solution {
   
    public List<Integer> findAnagrams(String s, String p) {
         
        int[] phash = new int[26];
        int[] shash = new int[26];
        List<Integer> ans= new ArrayList<>();
        if(s.length()<p.length()){
            return ans;
        }
        int i = 0;
        int j = 0;
        while(i<p.length()){
            phash[p.charAt(i)-'a']++;
            shash[s.charAt(i)-'a']++;
            i++;
        }
         i -= 1 ;
        while(i<s.length()){
            if(Arrays.equals(phash, shash)){
                ans.add(j);
            }
            i++;
            if(i != s.length()){
                shash[s.charAt(i)-'a']++;
            }
            shash[s.charAt(j)-'a']--;
            j+=1;
        }
        return ans;
    }
}