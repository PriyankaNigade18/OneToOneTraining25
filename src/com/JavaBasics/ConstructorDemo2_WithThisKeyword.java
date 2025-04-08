package com.JavaBasics;

public class ConstructorDemo2_WithThisKeyword 
{
	
	int id;
	String name;
	
		/*
	 * Constructor used to initialize Object
	 * this is used to refer current class instance variable and instance method
	 */
	public ConstructorDemo2_WithThisKeyword(String name,int id)
	{
		System.out.println("Constructor calling for initialize Object");
		System.out.println("This is Parameterized constructor....:");
		//instance=local
		this.name=name;
		this.id=id;
	}
	
	public void display()
	{
		System.out.println("Display() is calling.....");
		System.out.println("After initialize data is: ");
		System.out.println("id is:"+id);
		System.out.println("name is:"+name);
	}

	public static void main(String[] args) 
	{
		
		//Constructor get called at the time object creation
		//ConstructorDemo c1=new ConstructorDemo();
		
		ConstructorDemo2_WithThisKeyword c2=new ConstructorDemo2_WithThisKeyword("Sarang",101);
		c2.display();
		
		
		
		

	}

}
