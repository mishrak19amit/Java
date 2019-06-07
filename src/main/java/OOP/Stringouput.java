package OOP;

public class Stringouput {

	public static void main(String args[]) 
    { 
        String str = "Java Programming"; 
        char arr[] = new char[20]; 
        arr = str.toCharArray(); 
        System.out.println(arr); 
        
        
        String s="Amit";
        String ss= new String ("Amit");
        String ssss= new String ("Amit");
        String sss= "Amit";
        System.out.println(s==ss);
        System.out.println(ss==sss);
        System.out.println(s==sss);
        System.out.println(ss==ssss);
        System.out.println(s.equals(ss));
        System.out.println(ss.equals(ssss));
        System.out.println(s.equals(sss));
    } 
	
}
