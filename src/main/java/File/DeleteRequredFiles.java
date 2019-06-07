package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DeleteRequredFiles {
private static String directorypath=null;
private static Properties pr=null;
	public static void main(String[] args) {
		 pr= new Properties();
		try {
			pr.load(new FileInputStream("resources/config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		directorypath=pr.getProperty("FOLDERPATH");
		
		File filedirectoryname= new File(directorypath);
		
		if(filedirectoryname.isFile())
		{  
			checkAndDeleteFile(filedirectoryname);
		}
		else if(filedirectoryname.isDirectory())
		{
			
		doOperateOnFolder(filedirectoryname);
			
		}
		else
		{
			System.out.println("Please Re-run Program and provide the right folder path");
		}
			
	}
	
	static void doOperateOnFolder(File directoryname)
	{
		
		String listoffile[]=directoryname.list();
		String parentpath=directoryname.getAbsolutePath();
		for(int i=0;i<listoffile.length;i++)
		{  File filename= new File(parentpath+"/"+listoffile[i]);
			if(filename.isFile())
			{   
				checkAndDeleteFile(filename);
			}
			
			else
			{
				doOperateOnFolder(filename);
			}
		}
		
	}
	
	static void checkAndDeleteFile(File filename)
	{  Boolean flag=false;
		
		try {
			BufferedReader br= new BufferedReader(new FileReader(filename));
			String line;
			
			while((line=br.readLine())!=null)
					{
				if(line.contains(pr.getProperty("SPAECIALWORDS")))
				{
					flag=true;
					break;
				}
					}
			br.close();
			
			if(flag)
			{
				filename.delete();
				System.out.println("File: ["+filename.toString()+"] has been deleted.");
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
