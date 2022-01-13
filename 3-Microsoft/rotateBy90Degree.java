public rotateBy90Degree{
	static void rotate(int matrix[][]) 
	{ 
		int n = matrix.length;
	    for (int i = 0; i < n/2; ++i)
	    {
	        for(int j=i; j<n-i-1; j++)
	        {
	            // swap in anti-clockwise direction
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[j][n-1-i];        // right to top
	            matrix[j][n-1-i] = matrix[n-1-i][n-1-j];// bottom to right
	            matrix[n-1-i][n-1-j] = matrix[n-1-j][i];// left to bottom
	            matrix[n-1-j][i] = temp;                // top to left
	        }
	    }
	} 
}