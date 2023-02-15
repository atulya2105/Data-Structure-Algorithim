class Solution {
     HashSet <List<Integer>> hs = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        // List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        helper(nums,temp,new int[nums.length]);
        return new ArrayList(hs);
    }
    public void helper(int[] nums,ArrayList<Integer> temp,int[] boxes){
        
        if(temp.size()==nums.length){
            hs.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i = 0;i<nums.length;i++){
            
            if(boxes[i]!=1){
                boxes[i] = 1;
                temp.add(nums[i]);
                helper(nums,temp,boxes);
                temp.remove(temp.size()-1);
                boxes[i]=0;
            }
        }
    }
}
