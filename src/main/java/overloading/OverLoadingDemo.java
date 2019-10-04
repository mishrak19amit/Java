package overloading;

//OverLoadingDemo

public class OverLoadingDemo 
{ 
	private String function() 
	{ 
		return ("GFG"); 
	} 
	public final static String function(int data) 
	{ 
		return ("GeeksforGeeks"); 
	} 
	public static void main(String[] args) 
	{ 
		OverLoadingDemo obj = new OverLoadingDemo(); 
		System.out.println(obj.function(10));	 
	} 
} 

