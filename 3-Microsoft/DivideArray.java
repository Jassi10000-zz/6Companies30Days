class DivideArray
{

	public int minDifference(int arr[], int n) 
	{ 
	    Map<String, Integer> lookup = new HashMap<>();
	    return solve(arr, n - 1, 0, 0, lookup);
	} 
	public static int solve(int[] S, int n, int S1, int S2,
                                Map<String, Integer> lookup)
    	{
        if (n < 0) {
            return Math.abs(S1 - S2);
        }
        String key = n + "|" + S1;
        if (!lookup.containsKey(key))
        {
            int inc = solve(S, n - 1, S1 + S[n], S2, lookup);
            int exc = solve(S, n - 1, S1, S2 + S[n], lookup);
 
            lookup.put(key, Integer.min(inc, exc));
        }
 
        return lookup.get(key);
    }
}