import java.utils.*;

class kLargestElements {  
	 public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        //implementing MinHeap using priority queue.
        Queue<Integer> q = new PriorityQueue<Integer>();
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            //if size of priority queue becomes equal to k,
            if(q.size() == k) 
            { 
                //if top element is smaller than arr[i], we pop the front 
                //element from priority queue and push arr[i] in priority queue.
                if(q.peek() < arr[i]) 
                {
                    q.poll();
                    q.add(arr[i]);
                }
            } 
            //else we just push arr[i] in priority queue.
            else 
            {
                q.add(arr[i]);
            }
        }
        
        //while priority queue is not empty, we keep storing the top element 
        //in list and keep popping it from the priority queue.
        while(!q.isEmpty())
        {
            list.add(q.peek()); 
            q.poll();
        }
        //reversing the list and returning it.
        Collections.reverse(list);
        return list;
    }

}