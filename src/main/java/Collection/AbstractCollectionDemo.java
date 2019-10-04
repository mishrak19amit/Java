package Collection;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class AbstractCollectionDemo {

	public static void main(String[] args) {
		AbstractCollection<String> abstractDemo=new ArrayList<String>();
		abstractDemo.add("Amit");
		abstractDemo.add("Kumar");
		abstractDemo.add("Mishra");
		
		System.out.println("AbstractCollection: "
                + abstractDemo); 
		abstractDemo.add("Rohan");
		System.out.println("AbstractCollection: "
                + abstractDemo); 
	}
}
