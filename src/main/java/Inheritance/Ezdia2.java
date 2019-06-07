package Inheritance;

public class Ezdia2 {

	
		   public void makeNull(Ezdia2 a) {
		    a = null;
		   }
		   public void print() {
		     System.out.println("Hello");
		   }
		   public static void main(String args[]) {
			   Ezdia2 a = new Ezdia2();
		     a.makeNull(a);
		     a.print();
		  
		}
	
}
