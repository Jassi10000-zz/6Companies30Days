class partitionASet
{

	public int minDifference(int arr[], int n) 
	{ 
	    Map<String, Integer> lookup = new HashMap<>();
	    return solve(arr, n - 1, 0, 0, lookup);
	} 
	public static int solve(int[] S, int n, int S1, int S2,
                                Map<String, Integer> lookup)
    {
        // Base case: if the list becomes empty
        if (n < 0) {
            return Math.abs(S1 - S2);
        }
        String key = n + "|" + S1;
 
        // If the subproblem is seen for the first time, solve it
        if (!lookup.containsKey(key))
        {
            // Case 1. Include the current item in subset `S1` and recur
            // for the remaining items
            int inc = solve(S, n - 1, S1 + S[n], S2, lookup);
 
            // Case 2. Exclude the current item from subset `S1` and recur for the remaining items
            int exc = solve(S, n - 1, S1, S2 + S[n], lookup);
 
            lookup.put(key, Integer.min(inc, exc));
        }
 
        return lookup.get(key);
    }
}
