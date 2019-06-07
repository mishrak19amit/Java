package OOP;

public class Singleton {

	private static Singleton singleton_obj=null;
	String s;
	private Singleton() {
		// TODO Auto-generated constructor stub
	s="Hi Amit";
	}
	
	static Singleton getInstance()
	{
	if(singleton_obj==null)
		singleton_obj=new Singleton();
	
	return singleton_obj;
	}
	
	public static void main(String[] args) {
		
		Singleton obj1=  Singleton.getInstance();
		Singleton obj2=  Singleton.getInstance();
		
		obj1.s = (obj1.s).toUpperCase();
		System.out.println(obj1.s);
		System.out.println(obj2.s);
	}
	
}
