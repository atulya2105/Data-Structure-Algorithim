class Solution {
    public void sortColors(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length-1;
        while(j<=k){
            if(arr[j]==0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }else if(arr[j]==1){
                j++;
            }else if(arr[j]==2){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
                
            }
        }
    }
}