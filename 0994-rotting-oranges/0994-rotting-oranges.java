class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh_c = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0;i<n;i++ ){
            for(int j  = 0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh_c++;
                }
            }
        }
        if(fresh_c==0){
            return 0;
        }
        int time = 0;
        int c = 0;
        int dirs[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;i<size;i++){
                int[] p = q.poll();
                for(int[] dir : dirs){
                    int x = p[0]+dir[0];
                    int y = p[1]+dir[1];
                    if(x<0 || y<0 || x>=n ||y>=m || grid[x][y]!=1){
                        continue;
                        
                    }
                    grid[x][y]= 2;
                    fresh_c--;
                    q.offer(new int[]{x,y});
                }
            }
            time++;
        }
        if(fresh_c==0){
            return time-1;
        }else{
            return -1;
        }
    }
}