class possibleWordsFromPhoneDigits{
	class Solution
{
    static String hash[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    static ArrayList <String> possibleWords(int a[], int N)
    {
        String str = "";
        for(int i = 0; i < N; i++)
        str += a[i];
        ArrayList<String> res = possibleWordsUtil(str);
        Collections.sort(res); 
        return res;
                    
    }
    static ArrayList<String> possibleWordsUtil(String str)
    {
        
        if (str.length() == 0) { 
            ArrayList<String> baseRes = new ArrayList<>(); 
            baseRes.add(""); 
            return baseRes; 
        } 
        
       
        char ch = str.charAt(0); 
        
        String restStr = str.substring(1); 
  
      
        ArrayList<String> prevRes = possibleWordsUtil(restStr); 
        ArrayList<String> Res = new ArrayList<>(); 
      
        String code = hash[ch - '0']; 
  
        for (String val : prevRes) { 
  
            for (int i = 0; i < code.length(); i++) { 
                Res.add(code.charAt(i) + val); 
            } 
        } 
    
        return Res; 
    }
}

}