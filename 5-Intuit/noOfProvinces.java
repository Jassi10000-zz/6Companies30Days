class noOfProvinces {
    public int findCircleNum(int[][] graph) {
        boolean[] isVisited = new boolean[graph.length];
        int numberOfProvinces = 0;
        for(int i = 0; i < graph.length; i++) {
            if(!isVisited[i]) {
                dfs(graph, i, isVisited);
                numberOfProvinces++;
            }
        }
        
        return numberOfProvinces;
    }
    
    private void dfs(int[][] graph, int source, boolean[] isVisited) {
        isVisited[source] = true;
        for(int neighbour = 0; neighbour < graph.length; neighbour++) {
            if(!isVisited[neighbour] && graph[source][neighbour] == 1) {
                dfs(graph, neighbour, isVisited);
            }
        }
    }
}