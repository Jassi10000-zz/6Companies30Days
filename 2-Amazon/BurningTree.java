class BurningTree{
    public static int maxDepth(Node n)
	{
		if (n == null)
			return 0;
		return 1 + Math.max(maxDepth(n.left), maxDepth(n.right));
	}

	public static int traverse(Node n, int target, int ret[]) {
		if (n == null)
			return 0;
		if (n.data == target)
		{
		    ret[0] = Math.max(ret[0], maxDepth(n.right));
		    ret[0] = Math.max(ret[0], maxDepth(n.left));
		    return 1;
		}
		int val = traverse(n.left, target, ret);
		if (val != 0)
		{
			ret[0] = Math.max(ret[0], val + maxDepth(n.right));
			return val + 1;
		}

		val = traverse(n.right, target, ret);
		if (val != 0)
		{
			ret[0] = Math.max(ret[0], val + maxDepth(n.left));
			return val + 1;
		}

		return 0;
	}

	public static int minTime(Node root, int target) {
		int[] ret = { 0 };
		traverse(root, target, ret);
		return ret[0];
	}
}