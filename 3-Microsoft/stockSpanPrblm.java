class stockSpanPrblm{
{
    public static int[] calculateSpan(int price[], int n)
    {
        int S[] = new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        S[0]=1;
        
        for(int i=1;i<n;i++) 
        { 
            while(!st.isEmpty() && price[i]>=price[st.peek()])
            {
                st.pop();
            }
            S[i]=st.isEmpty()?i+1:i-st.peek();
            
            st.push(i);
            
        }
        return S;
    }
    
}