class Nuts&BotsProblem {
    void matchPairs(char nuts[], char bolts[], int n) {
       for(int i = 0; i < n; i++){
           bolts[i] = nuts[i];
       }
       Arrays.sort(nuts);
       Arrays.sort(bolts);
       return ;
   }
}