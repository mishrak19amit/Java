package Exception;

public class TrowDemo {

	static void fun()
	{ 
		try {
			throw new NullPointerException("Amit");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Amit please help!");
			throw e;
		}
	}
	
	public static void main(String[] args) {
		
		try {
			fun();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Amit you throw exception");
			
		}
	}
}
