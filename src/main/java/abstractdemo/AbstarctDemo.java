package abstractdemo;

import java.util.HashSet;

class Demo{
	private Long i;
	private String name;
	
	void getData()
	{
		System.out.println("Amit");
	}

	public Long getI() {
		return i;
	}

	public void setI(Long i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class AbstarctDemo {
	
	public static void main(String[] args) {
		Demo obj= new Demo();
		obj.setI(1L);
		obj.setName("Nitish");
		
			Demo obj1= new Demo();
			obj1.setI(1L);
			obj1.setName("Nitish R");
			
		HashSet<Object> set  = new HashSet<>();
		set.add(obj1);
		
		set.add(obj);
		System.out.println(set.size());
	}
	
	

	
}
