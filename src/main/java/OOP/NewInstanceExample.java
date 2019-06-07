package OOP;

// Java program to illustrate creation of Object
// using new Instance
public class NewInstanceExample implements Cloneable {
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	String name = "GeeksForGeeks";

	public static void main(String[] args) {
		NewInstanceExample obj1 = new NewInstanceExample();
		try {
			NewInstanceExample obj2 = (NewInstanceExample) obj1.clone();
			System.out.println(obj2.name);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
