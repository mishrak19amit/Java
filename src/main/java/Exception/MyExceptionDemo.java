package Exception;

class CustomExceptionDemo extends Exception {
	CustomExceptionDemo(String s) {
		super(s);
	}
}

public class MyExceptionDemo {

	public static void main(String[] args) {

		try {

			throw new CustomExceptionDemo("Dividing by 0");
		} catch (CustomExceptionDemo e) {
			System.out.println(e.getMessage());
		}
	}

}
