class Solution {
    public boolean isValidSudoku(char[][] board) {
      
    int [] vset = new int [9];
    int [] hset = new int [9];
    int [] bckt = new int [9];
    int idx = 0;
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if (board[i][j] != '.') {
                idx = 1 << (board[i][j] - '0') ;
                if ((hset[i] & idx) > 0 ||
                    (vset[j] & idx) > 0 ||
                    (bckt[(i / 3) * 3 + j / 3] & idx) > 0) return false;
                hset[i] |= idx;
                vset[j] |= idx;
                bckt[(i / 3) * 3 + j / 3] |= idx;
            }
        }
    }
    return true;
        
    }
    boolean isValid(char[][] board, int row, int col, int ch){
        for(int i = 0;i<9;i++){
            // check column 
            if(board[row][i]==ch)
                return false;
            // check row
            if(board[i][col]==ch)
                return false;
            if(board[(3*row/3)+i/3][3*(col/3)+i%3]==ch)
                return false;
        }
        return true;
    }
}