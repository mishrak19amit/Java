package Inheritance;



	// file name: Main.java
	class Base {
	    private void foo() {}
	}
	 
	class Derived extends Base {
	    public void foo() { System.out.println("Amit Mishra");} // works fine
	}
	 
	public class RistrictiveAccess {
	    public static void main(String args[]) {
	        Derived d = new Derived();
	        d.foo();
	    }
	}
	
