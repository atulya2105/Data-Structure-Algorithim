class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int mx = Integer.MIN_VALUE;
        int n = piles.length;
        for(int i = 0;i<n;i++){
            mx = Math.max(mx,piles[i]);
        }
        int speed = 0;
        int low = 0;
        int high = mx;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(isPossible(piles,h,mid)==true){
                speed = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return speed;
        
    }
    public static boolean isPossible(int[] piles, int h, int mid){
        int cnt= 0;
        for(int i = 0;i<piles.length;i++){
            cnt += (int) Math.ceil(piles[i]*1.0/mid);
        }
        return cnt<=h;
    }
}