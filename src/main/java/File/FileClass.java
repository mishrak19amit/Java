package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {

	public static void main(String[] args) {
		//amazon.txt
		File a= new File("D:\\Bhai Document\\2Amit Mishra\\debitcard.txt");
		
		try {
			Scanner sc = new Scanner(a);
			Scanner ssc= new Scanner(a);
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
			System.out.println();
			
			ssc.useDelimiter("\\z");
			System.out.println(ssc.next());
			System.out.println();
			sc.close();
			ssc.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			BufferedReader br= new BufferedReader(new FileReader(a));
			String s;
			while((s=br.readLine())!=null)
				System.out.println(s);
			System.out.println();
			br.close();
			
			FileReader fr= new FileReader("D:\\\\Bhai Document\\\\2Amit Mishra\\\\debitcard.txt");
			
			int i;
			while((i=fr.read())!=-1)
				System.out.print((char)i);
			System.out.println();
			System.out.println();
			if(a.isFile())
				System.out.println("It is a file: "+a);
			else if(a.isDirectory())
				System.out.println("It is a directory: "+a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
