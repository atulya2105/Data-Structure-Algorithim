class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        //int[] ans = new int[1000];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
           // hm.put(arr[i],hm.getOrDefault(hm.get(arr[i]),0)+1);
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
       // System.out.print(hm.size());
        HashSet<Integer> hs = new HashSet<>();
        for(Integer it : hm.values()){
            if(hs.contains(it)){
                return false;
            }
            hs.add(it);
            //System.out.print(it+" ->"+ hm.get(it)+" " );
        }
        return true;
    }
}