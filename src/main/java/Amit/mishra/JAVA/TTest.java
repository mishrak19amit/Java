package Amit.mishra.JAVA;

//A Java program to demonstrate that non-method
//members are accessed according to reference
//type (Unlike methods which are accessed according
//to the referred object)

class Parent
{
 int value = 1000;
}

class Child extends Parent
{
 int value = 10;
}

//Driver class
class TTest
{
 public static void main(String[] args)
 {
     Parent cobj = new Child();
     Parent par = cobj;

     // Using instanceof to make sure that par
     // is a valid reference before typecasting
     if (par instanceof Child)
     {
         System.out.println("Value accessed through " +
             "parent reference with typecasting is " +
                                  (par).value);
     }
 }
}
