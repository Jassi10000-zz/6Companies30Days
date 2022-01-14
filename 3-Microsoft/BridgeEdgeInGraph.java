class BridgeEdgeInGraph{
{
 void DFS(ArrayList<ArrayList<Integer>> adj, int v, boolean visited[]) 
    {
        visited[v] = true;
        
        for (int i = 0; i < adj.get(v).size(); ++i)
        
            if (!visited[adj.get(v).get(i)])
                DFS(adj, adj.get(v).get(i), visited);
    }
    
    boolean isConnected(ArrayList<ArrayList<Integer>> adj,int V,int one,int two)
    {
        boolean visited[] = new boolean[V];
        DFS(adj, one, visited);
        if (visited[two] == false)
            return false;
        return true;
    }
    public int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d) 
    {
        if (!isConnected(adj, V, c, d))
            return 0;
        else
        {
            adj.get(c).remove(new Integer(d));
            adj.get(d).remove(new Integer(c));
            if (isConnected(adj, V, c, d))
                return 0;
            else
                return 1;
        }
    }
}