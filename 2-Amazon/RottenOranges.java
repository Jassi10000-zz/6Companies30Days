class RottenOranges{
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int time=0,noOfFreshOranges=0;
        
        LinkedList<Integer> q = new LinkedList<Integer>();
        int[][] dir = {{1,0} , {-1,0} , {0,1} , {0,-1}};
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    noOfFreshOranges++;
                }
                else if(grid[i][j] == 2){
                    q.addLast(i*m+j);
                    grid[i][j] =2;
                }
            }
        }
        
        if(noOfFreshOranges == 0) return 0;
        
        while(q.size() != 0){
            int size = q.size();
            while(size-- > 0){
                int rottenedOrangeIdx = q.removeFirst();
                int sr = rottenedOrangeIdx / m;
                int sc = rottenedOrangeIdx % m;
                
                for(int d=0;d<4;d++){
                    int r = sr + dir[d][0];
                    int c = sc + dir[d][1];
                    
                    if(r>=0 && c>=0 && r<n && c<m && grid[r][c] == 1){
                        if(--noOfFreshOranges == 0) return time+1;
                        grid[r][c] = 2;
                        q.addLast(r*m+c);
                    }
                }
            }
            time++;
        }
        return -1;
    }
}