package Exception;

class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String s) {
		super(s);
	}
}

public class UserDefinedException {

	static int computeDiv(int a, int b) throws MyException {
		if (b == 0)
			throw new MyException("Dividing by Zero");
		int c = a / b;

		return c;
	}

	public static void main(String[] args) {

		try {
			System.out.println(computeDiv(3, 0));
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
