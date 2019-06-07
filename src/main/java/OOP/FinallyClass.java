package OOP;

public class FinallyClass {

	public static void main(String[] args) {
		getvalue();
	}

	static int getvalue() {
		try {
			int a = 2;
			int b = 1;
			int c = a / b;
			return c;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally called!");
		}
		return 0;
	}

}
