package Amit.mishra.JAVA;
//Java program to demonstrate Unboxing
	import java.util.ArrayList;
	 
	
public class Wrapper_Unboxing {

	
	
	    public static void main(String[] args)
	    {
	        // parsing different strings
	        int z = Integer.parseInt("654",8); 
	        int a = Integer.parseInt("-FF", 16);
	        long l = Long.parseLong("2158611234",10); 
	             
	        System.out.println(z);
	        System.out.println(a);
	        System.out.println(l);
	             
	        // run-time NumberFormatException will occur here
	        // "Geeks" is not a parsable string
	       // int x = Integer.parseInt("Geeks",8); 
	             
	        // run-time NumberFormatException will occur here
	        // (for octal(8),allowed digits are [0-7])
	        int y = Integer.parseInt("164",8); 
	        System.out.println(y);
	             
	    }
	}