package HackerRank;

import java.util.Stack;

public class CharArrayString {
	
	public static void main(String[] args) {
		String s=" Amit Mishra";
		s=s.trim();
		char[] arr=s.toCharArray();
		char c=s.charAt(0);
		Stack<Integer> sc= new Stack<Integer>();
		sc.push(1);
		sc.peek();
		sc.pop();
		int[][] arr2d= new int[4][5];
		System.out.println(arr2d.length);
		System.out.println(arr2d[0].length);
	}

}
