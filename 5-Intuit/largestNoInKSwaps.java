class Res {
    static String max = "";
}

class largestNoInKSwaps{
{
    public static void findMaximumNumUtil(char ar[], int k, Res r)
    {
        if (k == 0) return;
        int n = ar.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (ar[j] > ar[i])
                {
                    char temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;

                    String st = new String(ar);
                    if (r.max.compareTo(st) < 0)
                    {
                        r.max = st;
                    }
                    findMaximumNumUtil(ar, k - 1, r);
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
    public static String findMaximumNum(String str, int k)
    {
        Res r = new Res();
        r.max = str;
        findMaximumNumUtil(str.toCharArray(), k, r);
        return r.max;
    }

}