class ColNameFromColNo
{
     String colName (long n)
    {
    	String res = ""; 
    	long temp;
    	while (n > 0)
    	{
    	    n--;
    		temp = n % 26;
    		res += (char)('A' + temp);
    		n /= 26;
    	}
    	int len = res.length ();
    	String ans = "";
    	for (int  i = len - 1; i >= 0; i--)
    	    ans += res.charAt (i);
    	return ans;
    }
}