package StringT;

import com.google.common.base.Joiner;
import java.util.Arrays;
import java.util.List;

public class ListToString {

	public static void main(String[] args) {
		List<Character> str = Arrays.asList('G', 'e', 'e', 'k'); 
		  
        // convert in string 
        // use join() method 
        String string = Joiner.on(",").join(str); 
  
        // print string 
        System.out.println(string); 
	}
}
