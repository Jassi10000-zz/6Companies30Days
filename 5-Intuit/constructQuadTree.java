class constructQuadTree {
    // n == grid.length == grid[i].length
    public Node construct(int[][] grid) {
        if (grid == null || grid.length == 0) return null;
        return construct(grid, 0, grid.length - 1, 0, grid.length - 1);
    }
    
    private Node construct(int[][] grid, int startX, int endX, int startY, int endY) {
        if (startX == endX) {
            return new Node(grid[startX][startY] == 1, true);
        }
        int midX = (startX + endX) / 2;
        int midY = (startY + endY) / 2;
        Node node = new Node();  //  set val to any value and set isLeaf to False.
        Node topLeft = construct(grid, startX, midX, startY, midY);
        Node bottomLeft = construct(grid, midX + 1, endX, startY, midY);
        Node topRight = construct(grid, startX, midX, midY + 1, endY);
        Node bottomRight = construct(grid, midX + 1, endX, midY + 1, endY);
        // If all children are leaves and they all have same val, then the node is leaf and set the val.
        if (topLeft.isLeaf && bottomLeft.isLeaf && topRight.isLeaf && bottomRight.isLeaf 
            && topLeft.val == bottomLeft.val && topLeft.val == topRight.val && topLeft.val == bottomRight.val) {
            node.val = topLeft.val;
            node.isLeaf = true;
        } else {
            node.topLeft = topLeft;
            node.bottomLeft = bottomLeft;
            node.topRight = topRight;
            node.bottomRight = bottomRight;
        }
        return node;
    }
}class Solution {
    // n == grid.length == grid[i].length
    public Node construct(int[][] grid) {
        if (grid == null || grid.length == 0) return null;
        return construct(grid, 0, grid.length - 1, 0, grid.length - 1);
    }
    
    private Node construct(int[][] grid, int startX, int endX, int startY, int endY) {
        if (startX == endX) {
            return new Node(grid[startX][startY] == 1, true);
        }
        int midX = (startX + endX) / 2;
        int midY = (startY + endY) / 2;
        Node node = new Node();  //  set val to any value and set isLeaf to False.
        Node topLeft = construct(grid, startX, midX, startY, midY);
        Node bottomLeft = construct(grid, midX + 1, endX, startY, midY);
        Node topRight = construct(grid, startX, midX, midY + 1, endY);
        Node bottomRight = construct(grid, midX + 1, endX, midY + 1, endY);
        // If all children are leaves and they all have same val, then the node is leaf and set the val.
        if (topLeft.isLeaf && bottomLeft.isLeaf && topRight.isLeaf && bottomRight.isLeaf 
            && topLeft.val == bottomLeft.val && topLeft.val == topRight.val && topLeft.val == bottomRight.val) {
            node.val = topLeft.val;
            node.isLeaf = true;
        } else {
            node.topLeft = topLeft;
            node.bottomLeft = bottomLeft;
            node.topRight = topRight;
            node.bottomRight = bottomRight;
        }
        return node;
    }
}class Solution {
    // n == grid.length == grid[i].length
    public Node construct(int[][] grid) {
        if (grid == null || grid.length == 0) return null;
        return construct(grid, 0, grid.length - 1, 0, grid.length - 1);
    }
    
    private Node construct(int[][] grid, int startX, int endX, int startY, int endY) {
        if (startX == endX) {
            return new Node(grid[startX][startY] == 1, true);
        }
        int midX = (startX + endX) / 2;
        int midY = (startY + endY) / 2;
        Node node = new Node();  //  set val to any value and set isLeaf to False.
        Node topLeft = construct(grid, startX, midX, startY, midY);
        Node bottomLeft = construct(grid, midX + 1, endX, startY, midY);
        Node topRight = construct(grid, startX, midX, midY + 1, endY);
        Node bottomRight = construct(grid, midX + 1, endX, midY + 1, endY);
        // If all children are leaves and they all have same val, then the node is leaf and set the val.
        if (topLeft.isLeaf && bottomLeft.isLeaf && topRight.isLeaf && bottomRight.isLeaf 
            && topLeft.val == bottomLeft.val && topLeft.val == topRight.val && topLeft.val == bottomRight.val) {
            node.val = topLeft.val;
            node.isLeaf = true;
        } else {
            node.topLeft = topLeft;
            node.bottomLeft = bottomLeft;
            node.topRight = topRight;
            node.bottomRight = bottomRight;
        }
        return node;
    }
}