package HackerRank;

public class ValidSubstringCount_D {

	// Complete the substrCount function below.
	static long substrCount(int n, String s) {

		int count = 0;
		count = getSubCount(s, 0, n - 1);
		return count;

	}

	static int getSubCount(String s, int l, int r)
	{
		if(l==r) return 1;
		if(r<l) return 0;
		if(checkEqual(s,l,r)) {
			return 1+getSubCount(s,l+1,r-1);
		}
		else
		return Math.max(getSubCount(s,l+1,r),getSubCount(s,l,r-1));
	}
	
	static boolean checkEqual(String s, int l, int r) {
		
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r))
				return false;
			l++;
			r--;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		String s = "mnonopoo";

		System.out.println(substrCount(s.length(), s));
	}
}
