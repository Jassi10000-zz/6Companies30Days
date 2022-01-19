class minOperationsToConvertAToB {
   static int LISLength(int[] v) {
        if (v.length == 0)
            return 0;
        int[] tail = new int[v.length];
        int length = 1;
        tail[0] = v[0];
 
        for (int i = 1; i < v.length; i++) {
 
            if (v[i] > tail[length - 1]) {
                tail[length++] = v[i];
            }
            else {
                int idx = Arrays.binarySearch(
                if (idx < 0)
                    idx = -1 * idx - 1;
                tail[idx] = v[i];
            }
        }
        return length;
    }
    
    static int minInsAndDel(int[] A, int[] B, int N, int M) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<M; i++) {
            mp.put(B[i],i);
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
            if(mp.containsKey(A[i]))
                arr.add(mp.get(A[i]));
        }
        
        int[] res = new int[arr.size()];
        for(int i=0; i<arr.size(); i++)
            res[i] = arr.get(i);
        
        int ans = (N-LISLength(res)) + (M-LISLength(res));

        return ans;
    }

}