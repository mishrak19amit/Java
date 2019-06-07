package Amit.mishra.JAVA;

 class GFG 
{
 // overloaded method with refernce type formal argument
 public void method(Integer a)
 {
      
     System.out.println("Primitive type byte formal argument :" + a);
 }
  
}

class OveridingFinal
{
  
 public static void main (String[] args) 
 {
  
	 GFG c = new GFG();
      
     // invoking the method 
     int val = 5;
     c.method(val);
 }
}