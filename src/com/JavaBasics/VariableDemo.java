package com.JavaBasics;

public class VariableDemo
{
	//instance variable
	int id=101;
	String name="Swati";
	
	//static variable
	
	static String cname="AISSPMS";
	
	public void show()
	{
		int marks=90;//local variable
		System.out.println(cname);
		System.out.println("Student id is: "+id+" : Student Name is: "+name);
		System.out.println("Marks from show(): "+marks);
		
	}
	
	
	
	

	public static void main(String[] args)
	{
		int marks=100;
		System.out.println("Marks from main():"+marks);

		//create Object
		VariableDemo v1=new VariableDemo();
		v1.show();
		System.out.println("Student id is: "+v1.id);
		System.out.println("Student name is: "+v1.name);
		System.out.println(cname);

	}

}
