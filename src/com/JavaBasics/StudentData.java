package com.JavaBasics;

public class StudentData
{

	//data
	int id;
	String name;
	
	//method
	public void show()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	
	
	
	public static void main(String[] args)
	{
		/*
		 * To call anything from class we need Object
		 */
		
		
		StudentData s1=new StudentData();
		s1.id=101;
		s1.name="Smita";
		s1.show();
		
		
		System.out.println("****************************");
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Rama";
		s2.show();
		
	}

}
