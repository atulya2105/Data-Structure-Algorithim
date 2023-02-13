class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> s = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        dfs(0,board,ans);
        return ans;
    }
    void dfs(int col,char[][] board,List<List<String>> ans){
        if(col==board.length){
            ans.add(construct(board));
            return;
        }else{
            for(int row = 0;row<board.length;row++){
                if(isValid(board,row,col)){
                    board[row][col] = 'Q';
                    dfs(col+1,board,ans);
                    board[row][col] = '.';
                }
            }
        }
    }
    boolean isValid(char[][] board, int row,int col){
        int dupRow = row;
        int dupCol = col;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q')
                return false;
            col--;
            row--;
        }
        row = dupRow;
        col = dupCol;
        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;

        }
        row = dupRow;
        col = dupCol;
        while(col>=0 && row<board.length){
            if(board[row][col]=='Q')
                return false;
            row++;
            col--;
        }
        
        return true;
    }
    List<String> construct(char[][] board){
        List<String> res = new LinkedList<>();
        for(int i = 0;i<board.length;i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}