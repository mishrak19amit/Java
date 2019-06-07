package Interface;

//A simple interface
interface in1
{
 // public, static and final
  public int a = 10;

 // public and abstract 
 void display();
}

//A class that implements interface.
class TestClass implements in1
{
 // Implementing the capabilities of
 // interface.
 public void display()
 {
     System.out.println("Geek");
 }

 // Driver Code
 public static void main (String[] args)
 {
	 TestClass t = new TestClass();
     t.display();
     System.out.println(a);
 }
}