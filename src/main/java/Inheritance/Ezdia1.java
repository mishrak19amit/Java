package Inheritance;

public class Ezdia1 {

	public static boolean a() { 
	     System.out.println("a"); 
	     return false; 
	} 

	public static boolean b() { 
	     System.out.println("b"); 
	     return true; 
	} 

	public static void main(String[] args) {
		if ( b()&&a()) { 
		    System.out.println("found"); 
		}
	}
	
}
