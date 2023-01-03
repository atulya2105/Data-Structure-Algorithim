class Solution {
    public int minDeletionSize(String[] strs) {
        
        int k = strs[0].length();
        int cnt = 0;
        for(int col = 0;col<k;col++){
            for(int row = 1;row<strs.length;row++){
                if(strs[row].charAt(col)<strs[row-1].charAt(col)){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}