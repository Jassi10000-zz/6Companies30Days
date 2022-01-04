import java.util.*;
import java.util.Scanner;

class minSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int i, sum = 0;
        while (left <= right && right < nums.length && left >= 0) {
            sum = 0;
            for (i = left; i <= right; i++)
                sum = sum + nums[i];
            if (sum >= target) {
                if (right - left < ans)
                    ans = right - left;
                left = left + 1;
            } else if (sum < target) {
                right = right + 1;
            }
        }
        if (ans == Integer.MAX_VALUE)
            return 0;
        return ans + 1;
    }
}