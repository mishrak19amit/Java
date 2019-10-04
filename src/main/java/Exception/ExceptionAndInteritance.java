package Exception;

//----
//class Parent{  
//  void msg(){System.out.println("parent");}  
//}  
//  
//class ExceptionAndInteritance extends Parent{  
//  void msg()throws ArithmeticException{  
//    System.out.println("TestExceptionChild");  
//  }  
//  public static void main(String args[]){  
//   Parent p=new ExceptionAndInteritance();  
//   p.msg();  
//  }  
//}
//---

class Base extends Exception {
}

class Derived extends Base {
}

public class ExceptionAndInteritance {
	public static void main(String args[]) {
		// some other stuff
		try {
			// Some monitored code
			throw new Derived();
		} catch (Derived d) {
			System.out.println("Caught derived class exception");
		} catch (Base b) {
			System.out.println("Caught base class exception");
		}

	}
}
