package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

public class WritinIntoFile {

	public static void main(String[] args) {
		try {
			PrintWriter pr= new PrintWriter("D:\\\\Bhai Document\\\\2Amit Mishra\\\\output.txt");
			BufferedReader br = new BufferedReader(new FileReader("D:\\\\Bhai Document\\\\2Amit Mishra\\\\amazon.txt"));
			
			String s=br.readLine();
			HashSet<String> hs= new HashSet<String>();
			while(s!=null)
			{
			    if(hs.add(s))	
				pr.println(s);
			    
			    s=br.readLine();
			}
			
			pr.flush();
			//pr.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
