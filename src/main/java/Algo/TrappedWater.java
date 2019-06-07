package Algo;

import java.util.Scanner;

public class TrappedWater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(0<t--)
		{  int i=0;
			int n=sc.nextInt();
			int arr[]=new int[n];
			while(0<n--)
			{
				arr[i]=sc.nextInt();
				i++;
			}
			int start=0;
			int next=0;
			int literwater=0;
			int toltalwater=0;
			while(next<arr.length-1)
			{
				start=next;
				next=next(start,arr);
				literwater=getliterwater(start,next,arr);
				if(0<literwater)
					toltalwater=toltalwater+literwater;
			}
			
			System.out.println(toltalwater);
			
					
		}
		sc.close();
		
	}
	public static int getliterwater(int start, int next, int[] arr)
	{  int totalliter=0;
		if(arr[start]<arr[next])
			totalliter=arr[start]*(next-start-1);
		else
			totalliter=arr[next]*(next-start-1);
		
	
	for (int i = start+1; i < next; i++) {
		totalliter=totalliter-arr[i];
	}
		return totalliter;
	}
	
	public static int next(int start,int[] arr) {
		int next=0;
		for (int i = start+1; i < arr.length; i++) {
			if(arr[start]<=arr[i])
			{
				next=i;
				break;
			}
				
		}
		if(next==0)
			return (arr.length-1);
		else
		return next;
	}
}
