package com.JavaBasics;

public class ConstructorDemo3_Scenario {

	int id;
	String name;
	
	public ConstructorDemo3_Scenario(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public void show()
	{
		System.out.println("Student id is: "+this.id);
		System.out.println("Student name is: "+this.name);
	}
	
	public static void main(String[] args)
	{
		ConstructorDemo3_Scenario c1=new ConstructorDemo3_Scenario(101,"Abhi");
		c1.show();


		ConstructorDemo3_Scenario c2=new ConstructorDemo3_Scenario(102,"Kirti");
		c2.show();
		ConstructorDemo3_Scenario c3=new ConstructorDemo3_Scenario(103,"Mayur");
		c3.show();
		ConstructorDemo3_Scenario c4=new ConstructorDemo3_Scenario(104,"Kiran");
		c4.show();
		ConstructorDemo3_Scenario c5=new ConstructorDemo3_Scenario(105,"Banu");
		c5.show();
	}

}
