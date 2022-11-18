class Solution {
    public void sortColors(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length-1;
        while(i<=k){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }else if(arr[i]==1){
                i++;
            }else if(arr[i]==2){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }
}