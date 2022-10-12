class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr = new int[2];
        for(int i = 0;i<nums.length;i++){
            int sum = target-nums[i];
            if(hm.containsKey(sum)){
                arr[0] = i;
                arr[1] = hm.get(sum);
            }else{
                hm.put(nums[i],i);
            }
        }
        return arr;
    }
}