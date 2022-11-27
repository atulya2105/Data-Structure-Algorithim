class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int mx = piles[0];
        int n = piles.length;
        for(int i = 0;i<n;i++){
            mx = Math.max(mx,piles[i]);
        }
        int speed = 1;
        int low = 1;
        int high = mx;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(isPossible(piles,h,mid)){
                speed = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return speed;
        
    }
    public static boolean isPossible(int[] piles, int h, int mid){
        long cnt= 0;
        for(int i = 0;i<piles.length;i++){
            cnt += (long)piles[i]/mid;
            if(piles[i]%mid!=0){
                cnt++;
            }
        }
        return cnt<=h;
    }
}