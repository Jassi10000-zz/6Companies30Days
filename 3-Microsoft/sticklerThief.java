class sticklerThief{
{
     public int FindMaxSum(int arr[], int n)
    {
        int incl_curr = arr[0];    
        int excl_curr = 0;  
        
        int incl_prev = incl_curr;
        int excl_prev = excl_curr;
        
	    for(int i = 1; i <n; i++)
	    {
	        excl_curr = Math.max(incl_prev, excl_prev);
	        
            incl_curr = excl_prev + arr[i];
          
            excl_prev = excl_curr;  
            incl_prev = incl_curr;  
	    }
	  
	    return Math.max(excl_curr, incl_curr);
    }
}