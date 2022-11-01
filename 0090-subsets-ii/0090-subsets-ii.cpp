class Solution {
public:
     vector<int> set;
    vector<vector<int>> ans;
    
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        
        sort(nums.begin(), nums.end());
        
        buildSol(nums, 0);
        
        return ans;
        
    }
    
    void buildSol(vector<int>& nums, int start){
        
        if (start == nums.size()){
            
            ans.push_back(set);
            return;
        }
        
        //take this nums[start]
        set.push_back(nums[start]);
        
        buildSol(nums, start+1);
        
        set.pop_back();
        
        //dont take this nums[start]
        //if you decide to skip, you have to skip all values == nums[start] as they have been considered already when you decided to take nums[start]
        while(start+1 < nums.size() && nums[start+1] == nums[start]) start++;
        
        buildSol(nums, start+1);
        
  
    }
};