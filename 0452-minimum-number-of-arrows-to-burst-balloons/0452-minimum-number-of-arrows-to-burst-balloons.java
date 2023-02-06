class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int lastPoint = points[0][1];
        int cnt = 1;
        for(int[] p : points){
            if(p[0]>lastPoint){
                cnt++;
                lastPoint = p[1];
            }
            lastPoint = Math.min(lastPoint,p[1]);
            
        }
        return cnt;
        
    }
}