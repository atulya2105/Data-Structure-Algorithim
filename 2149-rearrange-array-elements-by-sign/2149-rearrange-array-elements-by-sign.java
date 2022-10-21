class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }else{
                pos.add(nums[i]);
            }
        }
        int j = 0;
        int k = 0;
        int i = 0;
        while(i<neg.size() || j<pos.size()){
            if(i<pos.size()){
                nums[k++] = pos.get(i++);
            }
            if(j<neg.size()){
                nums[k++] = neg.get(j++);
            }
        }
        return nums;
    }
}