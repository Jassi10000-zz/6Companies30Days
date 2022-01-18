class smallestpalindromicNo
{
   public String nextPalin(String S) { 
        int n=S.length();
        char []N = new char[n];
        for(int i=0;i<n;i++){
            N[i]=S.charAt(i);
        }

        int mid=(n/2)-1;
        int pos=-1;
        
        for(int i=mid;i>=1;i--){
            if(N[i-1]<N[i]){
                pos=i-1;
                break;
            }
        }
        if(pos==-1){
            return "-1";
        }
        
        int numPos=-1;
        for(int i=pos+1;i<=mid;i++){
            if(N[i]>N[pos]){
               
               if(numPos==-1){
                   numPos=i;
               }
               else{
                   if(N[i]<N[numPos]){
                       numPos=i;
                   }
               }
               
            }
        }
    
        char temp = N[pos];
        N[pos]=N[numPos];
        N[numPos]=temp;
        Arrays.sort(N,pos+1,mid+1);

        int i=0;
        int j=n-1;
        while(i<=mid){
            N[j]=N[i];
            i++;
            j--;
        }

        return new String(N);
    }
}