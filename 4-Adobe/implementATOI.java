class implementATOI
{
	boolean isNumericChar(char x) {
		return (x>= '0' && x<='9')?true:false;
	}
	int atoi(String str)
	{
		int n = str.length();
		if(str == "")
			return 0;
		
		int res = 0;
		int sign = 1;
		int i = 0;
		
		char s[] = str.toCharArray();
		if(s[0]=='-')
		{
			sign = -1;
			i++;
		}
		
		for(;i<n;i++)
		{
			if(isNumericChar(s[i]) == false)
				return -1;
			res = res*10 + s[i] - '0';
		}
		return sign*res;
	}
}