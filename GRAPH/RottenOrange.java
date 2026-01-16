class RottenOrange {
    public int orangesRot(int[][] mat) {
        // code here
        
        int n=mat.length;
        int m= mat[0].length;
        
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
                else if(mat[i][j]==1)
                {
                    fresh++;
                }
                
            }
        }
        
        int[]  dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        
        int time=0;
        
        while(!q.isEmpty() && fresh>0)
        {
            int size = q.size();
            
            while(size-- > 0)
            {
                int[] curr = q.poll();
                
                for(int d=0;d<4;d++)
                {
                    int r = curr[0]+dr[d];
                    int c = curr[1]+dc[d];
                    
                    if(r>=0 && c>=0 && r<n &&  c<m && mat[r][c]==1)
                    {
                        mat[r][c]=2;
                        fresh--;
                        q.offer(new int[]{r,c});
                    }
                }
            }
            
            time++;
        }
        
        return fresh==0?time : -1;
        
    }
}