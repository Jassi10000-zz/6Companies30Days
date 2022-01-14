class generateBinaryNos{
   static ArrayList<String> generate(int N)
    {
       
        ArrayList<String> res = new ArrayList<String>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        
        while(N-- > 0)
        {
            String s1 = q.peek();
            q.poll();
            res.add(s1);
            String s2 = s1;
            q.add(s1 + '0');
            q.add(s2 + '1');
        }
       
        return res ;
    }
    
}
