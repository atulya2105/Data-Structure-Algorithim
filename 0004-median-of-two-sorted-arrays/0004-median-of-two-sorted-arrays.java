class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        int[] ans = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                ans[k] = nums1[i];
                i++;
                k++;
            }else{
                ans[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            ans[k++] = nums1[i++];
        }
        while(j<n){
            ans[k++] = nums2[j++];
        }
        
        int l = 0;
        int r = ans.length-1;
        int mid = l+r/2;
        if((m+n)%2==0){
            int x = ans[mid];
            int y = ans[mid+1];
            int z = x+y;
            System.out.println(x+" "+y);
            double res = (double)(z/2.0);
            //double res = (double)((ans[mid]+ans[mid+1])/2.0);
            return res;
        }else{
            return ans[mid]/1.0;
        }
        
    }
}