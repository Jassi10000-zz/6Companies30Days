class Solution
{
    public static int NumberOfPath(int a, int b)
    {
        int ans[][]=new int[a][b];
        for(int i=0;i<b;i++)
            ans[0][i]=1;
        for(int i=0;i<a;i++)
            ans[i][0]=1;
        for(int i=1;i<a;i++)
        {
            for(int j=1;j<b;j++)
                ans[i][j]=ans[i-1][j]+ans[i][j-1];
        }
        return ans[a-1][b-1];
    }
}