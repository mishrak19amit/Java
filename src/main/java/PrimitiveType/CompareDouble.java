package PrimitiveType;

public class CompareDouble {

	
	    public static void main(String[] args) 
	    { 
	  
	        // Get the two double values 
	        // to be compared 
	        double d1 = 1.00; 
	        double d2 = 1.0; 
	  
	        // function call to compare two double values 
	        if (Double.compare(d1, d2) == 0) { 
	  
	            System.out.println("d1=d2"); 
	        } 
	        else if (Double.compare(d1, d2) < 0) { 
	  
	            System.out.println("d1<d2"); 
	        } 
	        else { 
	  
	            System.out.println("d1>d2"); 
	        } 
	    } 
}
