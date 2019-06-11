package HackerRank;

public class SherlockString {

	public static void main(String[] args) {
		String s="abcdefghhgfedecba";
		System.out.println(validString(s));
	}
	
	static String validString(String s)
	{
		
		
		int arr[]= new int[26];
		char charArr[]=s.toCharArray();
		for(int i=0;i<charArr.length;i++)
		{
			arr[charArr[i]-'a']++;
		}
		int count=0;
		for(int a: arr) {
			if(a!=0)
				count++;
		}
		
		int sum=charArr.length;
		if(sum%count==1||sum%count==count-1|| sum%count==0)
		{
			int k=sum/count;
			
			for(int i=0;i<arr.length;)
			{
				if(arr[i]!=0)
				{
					if(arr[i]==k|| arr[i]==k+1)
						i++;
					else
					{
						return "NO";
					}
				}
				i++;
			}
			
			
			return "YES";
		}
		else {
			return "NO";
			
		}
		
		
		
		
		
	}
}
