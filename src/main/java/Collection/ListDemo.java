package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {
	List<String> subList= new ArrayList<String>();
	
	if(!subList.contains("Amit")) {
		System.out.println("Mishra");
		subList.add("Amit");
	}
	if(subList.contains("Amit")) {
		System.out.println("Amit");
	}
}
}
