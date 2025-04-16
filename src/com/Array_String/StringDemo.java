package com.Array_String;

public class StringDemo 
{
	/*
	 * String is collection of characters
	 * String in Java is Class from package java.lang
	 * String is immutable class in java
	 * Ways
	 * ========
	 * 1.using literal(recommended by java)
	 * ------------------------
	 * Memory will create inside SCP(String constant pool)
	 * SCP help for memory management as it not allow duplicate object
	 * 
	 * 2.Using new keyword
	 * -------------------------
	 * Memory will create inside heap area of jvm
	 * two objects will create one inside heap area and one inside 
	 * SCP
	 * 
	 * 
	 */

	public static void main(String[] args) 
	{


		String s1="Hello";
		
		String s2="Hello";
		
		System.out.println(s1==s2);//true
		
		System.out.println(s1.equals(s2));//true
		
		
		String s3=new String("Hello");
		
		System.out.println(s1==s3);//false
		
		System.out.println(s1.equals(s3));//true
		
		
		s1=s1+"All";
		
		System.out.println(s1==s2);//false
		
		
		s1=s1+"Test";
		

	}

}
