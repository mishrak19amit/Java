package overloading;

class Foo {
    public void method() {
        System.out.println("in Foo");
    }
} 

class Bar extends Foo {
    public  void method() {
        System.out.println("in Bar");
    }
}
public class StaticFinalOveriding {
	static int a;
	static {
		a=10;
		System.out.println(a);
	}

	public static void main(String[] args) {
		 
		Foo obj= new Bar();
        obj.method();
    }
	
}
