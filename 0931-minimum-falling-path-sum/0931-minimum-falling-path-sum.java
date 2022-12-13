class Solution {
    public int minFallingPathSum(int[][] A) {
        if(A == null || A.length == 0 || A[0].length == 0) return 0;
        
        int m = A.length;
        int n = A[0].length;
        int[][] M = new int[m][n]; // M[i][j] represents the min sum from top to A[i][j]
        // M[0][j] stays the same
        // M[i][j] = min(M[i - 1][j - 1], M[i - 1][j], M[i - 1][j + 1]) + A[i][j]
        
        // copy the 1st row to M[0]
        for(int j = 0; j < n; j++){
            M[0][j] = A[0][j];    
        }
        
        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                if(j == 0){
                    M[i][j] = Math.min(M[i - 1][j], M[i - 1][j + 1]);
                }else if(j == n - 1){
                    M[i][j] = Math.min(M[i - 1][j - 1], M[i - 1][j]);
                }else{
                    M[i][j] = Math.min(M[i - 1][j - 1], M[i - 1][j]);
                    M[i][j] = Math.min(M[i][j], M[i - 1][j + 1]);
                }
                M[i][j] += A[i][j];
            }
        }
        
        int min = Integer.MAX_VALUE;
        for(int num : M[m - 1]){
            min = Math.min(min, num);
        }
        
        return min; 
    }
}