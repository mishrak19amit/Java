package HackerRank;

public class ValidSubstringCount {

	static long substrCount(int n, String s) {
		int sum = 1;
		int subArr[] = new int[n];
		for (int i = 0; i < n; i++)
			subArr[i] = 1;

		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(checkEqual(s,j,i)) {
					subArr[i]++;
				}
			}
			sum=sum+subArr[i];
		}
			
		
		return sum;

	}

static boolean checkEqual(String s, int l, int r) {
		
		int k=(r-l)/2;
		int rem=(r-l)%2;
		String s1="";
		String s2="";
		StringBuilder revS2;
		if(rem==1)
		{
			s1=s.substring(l,l+k+1);
			s2=s.substring(l+k+1, r+1);
			revS2=new StringBuilder(s2);
			return s1.contentEquals(s2)&&s1.contentEquals(revS2.reverse().toString());
		}
		else
		{
			s1=s.substring(l,l+k);
			s2=s.substring(l+k+1, r+1);
			revS2=new StringBuilder(s2);
			return s1.contentEquals(s2)&&s1.contentEquals(revS2.reverse().toString());
		}
		
		
	}
	
	public static void main(String[] args) {
		//asasd, mnonopoo, abcbaba, aaaa
		String s = "abcbaba";

		System.out.println(substrCount(s.length(), s));
	}

}
