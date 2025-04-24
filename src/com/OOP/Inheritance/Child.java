package com.OOP.Inheritance;

public class Child extends Parent
{
	@Override
	public void color()
	{
		System.out.println("Blue");
	}

	public static void main(String[] args)
	{
		System.out.println("Scenario1: child class ref and child class Object");
		Child c1=new Child();
		c1.color();//blue
		
		System.out.println("Scenario2: Parent class ref and Parent class Object");
		Parent p1=new Parent();
		p1.color();//red
		
		System.out.println("Scenario3: Parent class ref and Child class Object");
		Parent p2=new Child();
		p2.color();//blue
		
		
		
		


		

	}

}
