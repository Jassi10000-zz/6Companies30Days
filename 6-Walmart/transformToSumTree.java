class transformToSumTree
{
    public int toSumTreeUtil(Node node)  
    { 
        if (node == null) 
            return 0; 
        int old_val = node.data; 
        node.data = toSumTreeUtil(node.left) + toSumTreeUtil(node.right); 
        return node.data + old_val; 
    } 

    public void toSumTree(Node node)
    {
        toSumTreeUtil(node);
    }
}