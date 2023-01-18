class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int n = nums.length;
        int right = n-1;
        while(left<=right){
            // middle element 
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
                // here it sorted 
            }else if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target<=nums[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                // if right parrt is sorted 
                if(target>=nums[mid] && target<=nums[right]){
                    left = mid+1;
                }else{
                    right= mid-1;
                }
            }
        }
            
        return -1;
    }
}