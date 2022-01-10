class Serialise&DesearliseaBT 
{
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    if(root!=null){
	        A.add(root.data);
	    }else{
	        A.add(-1);
	        return;
	    }
	    serialize(root.left, A);
	    serialize(root.right, A);
	}
	
    int idx = 0;
   public Node deSerialize(ArrayList<Integer> A)
   {
       if(idx>=A.size()||A.get(idx)==-1) {
           idx++;
           return null;
       }
       Node root = new Node(A.get(idx++));
       root.left = deSerialize(A);
       root.right = deSerialize(A);
       return root;
   }
};