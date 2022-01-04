import java.util.*;
import java.util.Scanner;

class totalDecodingMessages {

    public int CountWays(String S) {
        // code here
        if (S.charAt(0) == '0')
            return 0;

        int n = S.length();
        char str[] = S.toCharArray();

        long mod = 1000000007;

        long dp[] = new long[n + 1];

        dp[0] = dp[1] = 1;

        for (int i = 1; i < n; i++) {
            if (str[i] == '0' && str[i - 1] > '2')
                return 0;
        }

        for (int i = 2; i <= n; i++) {
            if (str[i - 1] > '0')
                dp[i] = dp[i - 1];

            if (str[i - 2] == '1' || (str[i - 2] == '2' && str[i - 1] < '7'))
                dp[i] += dp[i - 2];

            dp[i] %= mod;
        }

        return (int) dp[n];
    }
}