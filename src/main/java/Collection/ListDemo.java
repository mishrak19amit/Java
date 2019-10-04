package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
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
	
	List<String> list1= new ArrayList<String>();
	list1.add("Amit");
	list1.add("Amit1");
	list1.add("Amit2");
	list1.add("Amit3");
	
	for(String s: list1)
		System.out.println(s);
	
	List<String> list2= new LinkedList<String>();
	list2.add("Amit");
	list2.add("Amit1");
	list2.add("Amit2");
	list2.add("Amit3");
	
	for(String s: list2)
		System.out.println(s);
	
}
}
