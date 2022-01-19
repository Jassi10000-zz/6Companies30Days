class leadersInAnArray{
    static ArrayList<Integer> leaders(int arr[], int n){
        int maxEle = arr[n-1];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=n-1; i>=0; i--) {
		    if(arr[i] >= maxEle){
		        maxEle = arr[i];
		        res.add(maxEle);
		    }
		}
		Collections.reverse(res);
		
        return res;
    }
}
