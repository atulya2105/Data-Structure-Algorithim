class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n  = capacity.length;
        for(int i= 0;i<n;i++){
            capacity[i] = capacity[i]-rocks[i];
        }
        
       int cnt =0;
        Arrays.sort(capacity);
        for(int i = 0;i<n;i++){
            if(additionalRocks >= capacity[i]){
                cnt++;
                additionalRocks -= capacity[i];
            }
        }
        
        return cnt;
    }
}