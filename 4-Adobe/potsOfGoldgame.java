class potsOfGoldgame
{
	public static int dp[][] =new int[1002][1002];
	public static int fun(int a[],int start,int end)
	{
		if(start>end)
		return 0;
		
		if(dp[start][end]!=-1)
		return dp[start][end];
		
		int aa= a[end] + Math.min(fun(a,start+1,end-1),fun(a,start,end-2));
		int bb= a[start]+Math.min(fun(a,start+2,end),fun(a,start+1,end-1));
		
		dp[start][end]=Math.max(aa,bb);
		int m=dp[start][end];
		return m;
	}
	public static int maxCoins(int A[],int n)
	{
		try{Arrays.fill(dp,0);}catch(ArrayStoreException ex){}
		for(int i=0;i<1001;i++)
		{
			for(int j=0;j<1001;j++)
			dp[i][j]=-1;
		}
		return fun(A,0,n-1);
	}
}