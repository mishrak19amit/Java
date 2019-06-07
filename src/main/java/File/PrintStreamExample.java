package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) {
		try {
			PrintStream ps= new PrintStream(new File("D:\\\\\\\\Bhai Document\\\\\\\\2Amit Mishra\\\\\\\\output.txt") );
			PrintStream console= System.out;
			
			System.setOut(ps);
			System.out.println("Hi Amit Mishra File");
			System.setOut(console);
			System.out.println("Hi Amit Mishra Console");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
