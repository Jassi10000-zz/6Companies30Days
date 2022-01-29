class guessNoHigherOrLowerii {
    int[][] best;
    public int getMoneyAmount(int n) {
        best = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(best[i], -1);
        }
        return dp(1, n);
    }
    
    private int dp(int lo, int hi) {
        if (lo >= hi) {
            return 0;
        } else {
            if (best[lo][hi] != -1) {
                return best[lo][hi];
            }
            int res = Integer.MAX_VALUE;
            for (int i = lo; i <= hi; i++) {
                int op1 = 0;
                int op2 = i + dp(lo, i - 1);
                int op3 = i + dp(i + 1, hi);
                int out = Math.max(op1, Math.max(op2, op3));
                res = Math.min(out, res);
            }
            best[lo][hi] = res;
            return res;
        }
    }       
}