class ConnectNoOfSubtrees
{
   int c=0;
    Tree()
    {
        c=0;
    }
   
    int countSubtreesWithSumXUtil(Node root,int x)
    { 
    	if (root==null)return 0;
    	int ls = countSubtreesWithSumXUtil(root.left,x);
    	int rs = countSubtreesWithSumXUtil(root.right, x);
    	
    	
    	int sum = ls + rs + root.data;
    	if (sum == x)
    	c++;
    	return sum;
    }
    int countSubtreesWithSumX(Node root, int x)
    {
    	if (root==null)return 0;
    	int ls = countSubtreesWithSumXUtil(root.left, x);
    	int rs = countSubtreesWithSumXUtil(root.right, x);
    	if ((ls + rs + root.data) == x)
    	c++;
    	return c;
    }
}