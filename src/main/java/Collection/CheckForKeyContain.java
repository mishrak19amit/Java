package Collection;

import java.util.ArrayList;

public class CheckForKeyContain {
	public static void main(String[] args) {

		ArrayList<String> list= new ArrayList<String>();
		list.add("Amit");
		list.add("Mishra");
		list.replaceAll(String::toUpperCase);
		if(list.contains("Amit")) {
			System.out.println("YES");
		}
		
	}
}
