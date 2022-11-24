class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
       Map<Integer, Integer> map = new TreeMap();
        
        for(int[] trip : trips){
            map.put(trip[1], map.getOrDefault(trip[1],0) + trip[0]);
            map.put(trip[2], map.getOrDefault(trip[2],0) - trip[0]);
        }
        
        int count = 0;
        for(int i : map.values()){
            count += i;
            if(count > capacity)
                return false;
        }
        return true;
    }
}
//2 1 5
///3 3 7
    