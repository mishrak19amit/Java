package OOP;


	class B
	{
	    B()
	    {
	        System.out.println("B-Constructor Called");
	    }
	 
	    {
	        System.out.println("B-IIB block");
	    }
	 
	}
	 
	// Child class
	class StaticBlocks extends B
	{
		StaticBlocks()
	    {
	        super();
	        System.out.println("A-Constructor Called");
	    }
	    {
	        System.out.println("A-IIB block");
	    }
	     
	    // main function
	    public static void main(String[] args)
	    {
	    	StaticBlocks a = new StaticBlocks();
	    }
	}
	
