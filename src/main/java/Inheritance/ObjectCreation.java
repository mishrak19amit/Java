package Inheritance;

//ObjectCreation


//Java program to illustrate  
//referring to a subclass 
//base class 
class Bicycles  
{ 
 // the Bicycle class has two fields 
 public int gear; 
 public int speed; 
       
 // the Bicycle class has one constructor 
 public Bicycles(int gear, int speed) 
 { 
     this.gear = gear; 
     this.speed = speed; 
 } 
       
 // the Bicycle class has three methods 
 public void applyBrake(int decrement) 
 { 
     speed -= decrement; 
 } 
       
 public void speedUp(int increment) 
 { 
     speed += increment; 
 } 
   
 // toString() method to print info of Bicycle 
 public String toString()  
 { 
     return("No of gears are "+gear 
             +"\n"
             + "speed of bicycle is "+speed); 
 }  
} 

//derived class 
class MountainBikes extends Bicycles  
{ 
   
 // the MountainBike subclass adds one more field 
 public int seatHeight; 

 // the MountainBike subclass has one constructor 
 public MountainBikes(int gear,int speed, 
                     int startHeight) 
 { 
     // invoking base-class(Bicycle) constructor 
     super(gear, speed); 
     seatHeight = startHeight; 
 }  
       
 // the MountainBike subclass adds one more method 
 public void setHeight(int newValue) 
 { 
     seatHeight = newValue; 
 }  
   
 // overriding toString() method 
 // of Bicycle to print more info 
 @Override
 public String toString()  
 { 
       
     return (super.toString()+ 
             "\nseat height is "+seatHeight); 
 } 
   
} 

//driver class 
public class ObjectCreation  
{ 
 public static void main(String args[])  
 { 
     // using superclass reference 
     // first approach 
	 Bicycles mb2 = new MountainBikes(4, 200, 20); 
       
     // using subclass reference( ) 
     // second approach 
     MountainBikes mb1 = new MountainBikes(3, 100, 25); 
       
     System.out.println("seat height of first bicycle is " 
                                         + mb1.seatHeight); 
           
     // In case of overridden methods 
     // always subclass  
     // method will be executed 
     System.out.println(mb1.toString()); 
     System.out.println(mb2.toString()); 

     /* The following statement is invalid because Bicycle 
     does not define a seatHeight.  
     // System.out.println("seat height of second bicycle is "  
                                             + mb2.seatHeight); */
                   
     /* The following statement is invalid because Bicycle 
     does not define setHeight() method.  
     mb2.setHeight(21);*/

     
     
 } 
}
