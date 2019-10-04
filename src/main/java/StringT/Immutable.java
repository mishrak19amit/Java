package StringT;

public class Immutable {

	public static void main(String[] args) {
		
		String s="Amit";
		String s1="Amit"+"Mishra";
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	
		if(s==s1)
			System.out.println("Equal");
		
		Integer a=4;
		Integer b=4;
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	
		
	}
	
	
	
}
