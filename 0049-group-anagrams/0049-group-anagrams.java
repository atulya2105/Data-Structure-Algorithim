class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(!hm.containsKey(temp)){
                List<String> list = new ArrayList<>();
                list.add(s);
                hm.put(temp,list);
            }else{
                hm.get(temp).add(s);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> arr: hm.values()){
            ans.add(arr);
        }
        return ans;
    }
}