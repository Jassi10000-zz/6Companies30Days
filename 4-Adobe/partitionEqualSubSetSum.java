class partitionEqualSubsetSum{
    static int equalPartition(int N, int arr[])
    {
        int sum = 0;
        for(int i = 0;i < N;i++)
            sum = sum + arr[i];
        if(sum%2 == 1)
            return 0;
        sum = sum/2;
        boolean[][] dp =new boolean[N+1][sum+1];
	    
	    for(int i= 0;i<dp.length;i++)
	        dp[i][0] = true;
	    
	    for(int i= 1;i<dp.length;i++)
	        dp[0][i] = false;
	     
	    for(int i = 1;i <= N;i++){
	        for(int j = 1;j <= sum;j++){
	            if(arr[i-1] > j){
	                dp[i][j] = dp[i-1][j];
	            }
	            else{
	                dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
	            }
	        }
	    }
	    return (dp[N][sum]?1:0);
    }
}
