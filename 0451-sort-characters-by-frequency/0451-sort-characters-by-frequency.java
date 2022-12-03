class Solution {
    public String frequencySort(String s) {
        HashMap<Character,StringBuilder> hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,new StringBuilder()).append(ch));
        }
        PriorityQueue<StringBuilder> pq = new PriorityQueue<>((a,b) -> (b.length()-a.length()));
        pq.addAll(hm.values());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            sb.append(pq.poll());
        }
        return sb.toString();
    }
}
