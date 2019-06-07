package Algo;

import java.util.Scanner;

public class BAD_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(0<t--)
		{   sc.next();
		
			String s= sc.nextLine();
			char[] arr=s.toCharArray();
			System.out.println(arr);
			if(checkconsvowel(arr) || checkconsonent(arr))
				System.out.println("1");
			else
				System.out.println("0");
		}
		sc.close();
	}
	
	public static boolean checkconsvowel(char[] arr)
	{
		return false;
	}
	
	
	public static boolean checkconsonent(char[] arr)
	{
		return false;
	}
}
