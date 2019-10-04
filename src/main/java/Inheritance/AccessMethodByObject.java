package Inheritance;

public class AccessMethodByObject {

	public static int getValue()
	{
		return 10;
	}
	
	public static void main(String[] args) {
		AccessMethodByObject obj= new AccessMethodByObject();
		AccessMethodByObject.getValue();
	}
	
}
