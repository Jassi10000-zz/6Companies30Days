class unitareaOf1's{
	class Solution
{
   int count;
    static boolean isSafe(int[][] M,int row,int col,boolean[][] visited,int ROW,int COL)
    {
        return ((row >= 0)&&(row<ROW)&&(col>=0)&& (col < COL)
                             && (M[row][col] == 1 && !visited[row][col]));
    }

    
    void DFS(int[][] M,int row,int col,boolean[][] visited,int ROW,int COL)
    {
        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };
        visited[row][col] = true;

      
        for (int k = 0; k < 8; k++) 
        {
            if (isSafe(M, row + dx[k], col + dy[k],visited, ROW, COL)) 
            {
                count++;
                DFS(M, row + dx[k], col + dy[k],visited, ROW, COL);
            }
        }
    }
    
   
    public int findMaxArea(int[][] grid)
    {
        int ROW = grid.length;
        int COL = grid[0].length;
        
      
        boolean[][] visited = new boolean[ROW][COL];

        int result = 0;
       
        for (int i = 0; i < ROW; i++) 
        {
            for (int j = 0; j < COL; j++) 
            {
                
                if (grid[i][j] == 1 && !visited[i][j]) 
                {
                    count = 1;
                    DFS(grid, i, j, visited, ROW, COL);

                    result = Math.max(result, count);
                }
            }
        }
        return result;
    }
}}