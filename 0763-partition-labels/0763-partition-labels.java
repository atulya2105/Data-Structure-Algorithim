class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            hm.put(ch,i);
        }
        int prev = -1;
        int mx = 0;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            char ch= s.charAt(i);
            mx = Math.max(mx,hm.get(ch));
            if(mx==i){
                ans.add(mx-prev);
                prev = mx;
            }
        }
        return ans;
    }
}