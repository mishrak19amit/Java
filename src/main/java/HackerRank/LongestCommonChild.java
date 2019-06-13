package HackerRank;

public class LongestCommonChild {

	static int longestCommonChildUtil(String s1, String s2,int l1, int n1, int l2, int n2) {
		
		if(l1==n1||l2==n2) return 0;
		if(s1.charAt(l1)==s2.charAt(l2)) {
			return 1+longestCommonChildUtil(s1,s2,l1+1,s1.length(),l2+1,s2.length());
		}
		else {
			return Math.max(longestCommonChildUtil(s1,s2,l1+1,s1.length(),l2,s2.length()), longestCommonChildUtil(s1,s2,l1,s1.length(),l2+1,s2.length()));
		}
		
	}
	
	static int longestCommonChild(String s1,String s2) {
		return longestCommonChildUtil(s1,s2,0,s1.length(),0,s2.length());
	}

	public static void main(String[] args) {
		String s1 = "HARRY";
		String s2 = "SALLY";

		System.out.println(longestCommonChild(s1, s2));
	}
}
