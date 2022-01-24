class capacityToShipPackages {
      private static boolean transferredInExactDdays(int[] weights, int mid, int days) {
        int idx = 0;
        int totalWeight = 0;
        int daysDone = 1;       // it's always day 1 :)
        
        while(idx < weights.length) {
            totalWeight += weights[idx];
            if(totalWeight > mid) {
                totalWeight = weights[idx];     // reset
                daysDone++;                     // and move to next day
                if(daysDone > days) {
                    return false;
                }
            }
            idx++;
        }
        
        return true;
    }
    

    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt(), right = Arrays.stream(weights).sum();
        while(left < right) {
            int mid = left + (right-left)/2;
            if(transferredInExactDdays(weights, mid, days)) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
}