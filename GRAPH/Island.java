class Island {
    public int countIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m=grid[0].length;
        
        boolean[][] visited = new boolean[n][m];
        int count = 0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='L' && !visited[i][j])
                {
                    dfs(grid,visited,i,j,n,m);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    
    public static void dfs(char[][] grid, boolean[][] visited,int row, int col,int n,int m)
    {
        if(row<0||col<0||row>=n||col>=m|| grid[row][col]=='W'||visited[row][col])
        {
            return;
        }
        
        visited[row][col]=true;
        
        int[] dr= {-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};
        
        for(int k=0;k<8;k++)
        {
            dfs(grid,visited,row+dr[k],col+dc[k],n,m);
        }
    }
}