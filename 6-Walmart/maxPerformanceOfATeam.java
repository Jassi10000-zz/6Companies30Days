class maxPerformanceOfATeam {
    
    class Pair
    {
        int speed;
        int eff;
        
        Pair(int speed, int eff)
        {
            this.speed=speed;
            this.eff=eff;
        }
    }
    
    public int maxPerformance(int num, int[] speed, int[] efficiency, int k) {
        ArrayList<Pair> list=new ArrayList<>();
        
        for(int i=0;i<num;i++)
        {
            list.add(new Pair(speed[i], efficiency[i]));
        }
        
        Collections.sort(list, new Comparator<Pair>()
                         {
                             public int compare(Pair a, Pair b)
                             {
                                 return a.eff-b.eff;
                             }
                         });
        
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>()
                        {
                            public int compare(Pair a, Pair b)
                            {
                                return a.speed-b.speed;
                            }
                        });
        
        long sum=0;
        long res=0;
        long mod=1000000007;
        int i;
        
        for(i=num-1;i>=num-k;i--)
        {
            pq.add(list.get(i));
            sum=(sum+list.get(i).speed);
            res=Math.max(res, sum*list.get(i).eff);
        }
        
        for(;i>0;i--)
        {
            Pair temp=pq.poll();
            sum=sum-temp.speed;
            pq.add(list.get(i));
            sum=sum+list.get(i).speed;
            res=Math.max(res, sum*list.get(i).eff);
        }
        
        return (int) (res%mod);
        
    }
}