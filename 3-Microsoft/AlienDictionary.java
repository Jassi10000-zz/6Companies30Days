class AlienDictionary
{
   private void dfsCheck(ArrayList<ArrayList<Integer>> adj, int i, Stack<Integer> st, boolean[] vis) {
		vis[i]=true;
		
		for(int it:adj.get(i)) {
			if(vis[it]==false) {
				dfsCheck(adj,it,st,vis);
			}
		}
		
		st.push(i);
	}
	
	
	private String topologicalSort(ArrayList<ArrayList<Integer>> adj,int n) {
		Stack<Integer> st=new Stack<>();
		boolean vis[]=new boolean [n];
		
				
		for(int i=0;i<n;i++) {
			if(vis[i]==false) {
				dfsCheck(adj,i,st,vis);
			}
		}
		
		String str="";
		while(!st.isEmpty()) {
		   char c=(char)(st.pop()+'a');
		   str+=Character.toString(c);
		}
		
		return str;
		
	}
    
    
    
    public String findOrder(String [] dict, int N, int K)
    {
       		  ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		  for(int i=0;i<K;i++) {
			  adj.add(i,new ArrayList<>());
		  }
		  
		  	for(int i=0;i<dict.length-1;i++) {
		  		for(int j=0;j<Math.min(dict[i].length(),dict[i+1].length());j++) {
		  			if(dict[i].charAt(j)!=dict[i+1].charAt(j)) {
		  				adj.get(dict[i].charAt(j)-'a').add(dict[i+1].charAt(j)-'a');
		  				break;
		  			}
		  		
		  		} 
		  	}
	
		  	Solution obj=new Solution();
		  	String str=obj.topologicalSort(adj, K);
		  	
		  
	         return str;
        
    }
}