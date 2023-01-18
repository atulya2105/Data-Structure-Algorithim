/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int lo = 0;
        int hi = mountainArr.length() - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1) && mountainArr.get(mid) < target)
                lo = mid + 1;
            else
                hi = mid;
        }
        if (mountainArr.get(lo) == target)
            return lo;
        
        // binary search on the right side of mountain
        hi = mountainArr.length() - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2 + 1;
            if (mountainArr.get(mid) < mountainArr.get(mid - 1) && mountainArr.get(mid) < target)
                hi = mid - 1;
            else
                lo = mid;
        }
        if (mountainArr.get(hi) == target)
            return hi;
        else
            return -1;
    }
    
    
}