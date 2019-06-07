package Interface;

//CompratorClass

import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
// A class to represent a student. 
class Studentt
{ 
    int rollno; 
    String name, address; 
  
    // Constructor 
    public Studentt(int rollno, String name, 
                               String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.rollno + " " + this.name + 
                           " " + this.address; 
    } 
} 
  
class Sortbyroll implements Comparator<Studentt> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Studentt a, Studentt b) 
    { 
        return -(a.rollno - b.rollno); 
    } 
} 
  
class Sortbyname implements Comparator<Studentt> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Studentt a, Studentt b) 
    { 
        return -(a.name.compareTo(b.name)); 
    } 
} 
  
// Driver class 
class CompratorClass 
{ 
    public static void main (String[] args) 
    { 
        ArrayList<Studentt> ar = new ArrayList<Studentt>(); 
        ar.add(new Studentt(111, "bbbb", "london")); 
        ar.add(new Studentt(131, "aaaa", "nyc")); 
        ar.add(new Studentt(121, "cccc", "jaipur")); 
  
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new Sortbyroll()); 
  
        System.out.println("\nSorted by rollno"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new Sortbyname()); 
  
        System.out.println("\nSorted by name"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
    } 
} 
