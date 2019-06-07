package OOP;

	 
	class StaticBlocks1 {
		
		  static int i;
		    int j;
		     
		    // start of static block 
		    static  {
		        i = 10;
		        System.out.println("static block called ");
		    }
		    // end of static block 
	    public static void main(String args[]) {
	 
	        // Although we don't have an object of Test, static block is 
	        // called because i is being accessed in following statement.
	    	StaticBlocks1 obj= new StaticBlocks1();
	    	StaticBlocks1 obj1= new StaticBlocks1();
	        System.out.println(i); 
	    }
	}
	
