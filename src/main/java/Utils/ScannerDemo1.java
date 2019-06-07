package Utils;



import java.util.Scanner; 
public class ScannerDemo1 
{ 
    public static void main(String[] args) 
    { 
        // Declare the object and initialize with 
        // predefined standard input object 
        Scanner sc = new Scanner(System.in); 
   
        // Character input 
        char c = sc.next().charAt(1); 
   
        // Print the read value 
        System.out.println("c = "+c); 
    } 
}
