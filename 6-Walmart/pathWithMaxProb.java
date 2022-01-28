class pathWithMaxProb {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        
        ArrayList<ArrayList<Cost>>al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int []x=edges[i];
            al.get(x[0]).add(new Cost(x[1],succProb[i]));
            al.get(x[1]).add(new Cost(x[0],succProb[i]));
        }
        
        Queue<Pair>q=new PriorityQueue<>();
        boolean[]visited=new boolean[n];
        q.add(new Pair(start,1));
        while(q.size()>0){
            
            Pair temp=q.remove();
            int edge=temp.e;
            if(edge==end)return temp.prop;
            if(visited[edge]==false){
                visited[edge]=true;
            
                for(int i=0;i<al.get(edge).size();i++){
                    if(!visited[al.get(edge).get(i).ed]){
                        q.add(new Pair(al.get(edge).get(i).ed,temp.prop*al.get(edge).get(i).cost));
                    }
                }
            }
        }
        return 0;
    }
}

class Pair implements Comparable<Pair>{
    int e;
    double prop;
    Pair(int e,double prop){
        this.e=e;
        this.prop=prop;
    }
    @Override
    public int compareTo(Pair x){
        return x.prop>this.prop?1:-1;
    }
    
    public String toString(){
        return "( "+e+" "+prop+" )";
    }
    
}

class Cost{
    int ed;
    double cost;
    Cost(int ed,double cost){
        this.ed=ed;
        this.cost=cost;
    }
}