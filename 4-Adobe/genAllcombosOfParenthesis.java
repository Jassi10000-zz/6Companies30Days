class genAllcombosOfParenthesis{
    
    public List<String> AllParenthesis(int n) {
        
        List<String> ans = new ArrayList<String>();
        generateParenthesis("",n,0,0,ans);
        
        return ans;
    }
    
    public void generateParenthesis(String s,int n,int opening_count, 
                                int closing_count,List<String> ans)
    {
        if(closing_count == n){
            ans.add(s);
            return;
        }
        
        if(opening_count > closing_count)
            generateParenthesis(s + ')',n,opening_count,closing_count+1,ans);
        
        if(opening_count < n)
            generateParenthesis(s + '(',n,opening_count+1,closing_count,ans);
        
        
    }
}