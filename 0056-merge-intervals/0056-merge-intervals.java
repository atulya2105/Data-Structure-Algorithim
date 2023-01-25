class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merge = new LinkedList<>();
        for(int[] it : intervals){
            if(merge.isEmpty() ||merge.getLast()[1]<it[0]){
                merge.add(it);
            } 
            else{
                merge.getLast()[1] = Math.max(merge.getLast()[1],it[1]);
            }
        }
         
        return merge.toArray(new int[merge.size()][]);
        
        
    }
}