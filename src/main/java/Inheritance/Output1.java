package Inheritance;

// Output1

class A 
{ 
    public void Top(String s)  
    { 
        System.out.print("A"); 
    } 
} 
  
public class Output1 extends A  
{ 
    public Output1(String s)  
    { 
        System.out.print("Output1"); 
    } 
    public static void main(String[] args)  
    { 
        new Output1("C"); 
        System.out.println(" "); 
    } 
} 
