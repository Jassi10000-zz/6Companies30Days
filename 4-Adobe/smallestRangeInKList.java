class Node
{
		int data;
		int row;
		int nextCol;
		Node(int data,int row,int nextCol)
		{
			this.data=data;
			this.row=row;
			this.nextCol=nextCol;
		}
}
class smallestRangeInKList
{
	static int[] findSmallestRange(int[][] arr,int n,int k){
	PriorityQueue<Node> pq=new PriorityQueue<Node>(new Comparator<Node>() {
		public int compare(Node n1,Node n2){
			return n1.data-n2.data;
			}
	});
	int max=0;
	int range=(int)1e9;
	for(int i=0;i<k;i++){
		pq.add(new Node(arr[i][0], i, 1));
		max=Math.max(max, arr[i][0]);
	}
    int res[] = new int[2];
	int start=-1;
	int end=-1;
	while(true){
		Node n1=pq.poll();
		int min=n1.data;
		if(range>max-min+1){
			range=max-min+1;
			start=min;
			end=max;
		}
		int nextRow=n1.row;
		int nextColumn=n1.nextCol;
		if(n1.nextCol<n){
			pq.add(new Node(arr[nextRow][nextColumn], nextRow, nextColumn+1));
			max=Math.max(max, arr[nextRow][nextColumn]);
		}
		else{
			break;
	}
 }
    int rangee[] = {start,end};
    return rangee;
	
 }
}