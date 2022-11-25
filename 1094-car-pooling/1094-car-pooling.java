class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
      int[] board = new int[1001];
        for(int[] t : trips){
            board[t[1]] += t[0];
            board[t[2]] -= t[0];
        }
        int load = 0;
        for(int i=0;i<1001;i++){
            load += board[i];
            if(load> capacity)
                return false;
        }
        return true;

    }
}
//2 1 5
///3 3 7
    