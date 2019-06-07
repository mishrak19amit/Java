package org.amit.Primitive;

public class CheckNullForDouble {
	private double val;

	public double getVal() {
		return val;
	}

	public void setVal(double val) {
		this.val = val;
	}
	
	
	public static void main(String[] args) {
		CheckNullForDouble obj= new CheckNullForDouble();
		obj.setVal(2.0);
		//if(obj.getVal()!=null)
		System.out.println(obj.getVal());
		String s="2";
		Double check= Double.parseDouble(s);
		if(check.equals(2.0))
			System.out.println("Amit");
		
	}
	
}
