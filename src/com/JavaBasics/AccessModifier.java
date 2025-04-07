package com.JavaBasics;

public class AccessModifier {

	
	int id=101;//default
	public String name="Sarang";
	private int phno=99877665;
	
	
	
	public static void main(String[] args) 
	{
		 AccessModifier a1=new AccessModifier();
		 System.out.println("*****Within same clas*********");
		 System.out.println(a1.id);
		 System.out.println(a1.name);
		 System.out.println(a1.phno);
		 
		 
		 

	}

}
