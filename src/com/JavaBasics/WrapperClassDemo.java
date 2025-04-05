package com.JavaBasics;

public class WrapperClassDemo {

	public static void main(String[] args) {
		/*
		 * Wrapper class is a class 
		 * which convert primitive in the form of object
		 * int- Integer
		 * char- Character
		 * byte- Byte
		 * float- Float
		 * long- Long
		 * short-Short
		 * double-Double
		 */
		
		//int x=100;//data
		
		//Object to primitive
		Integer y=100;//object ---int
		int x=y.intValue();
		System.out.println("Object to int primitive : "+x);
		
		
		Long l=8766555444L;
		long l1=l.longValue();
		System.out.println(l1);
		
		//primitive to object
		int a=90;
		Integer a1=Integer.valueOf(a);
		System.out.println(a1);
		
		double d1=78.89;
		Double dd1=Double.valueOf(d1);
		System.out.println(dd1);
		
		//Real time String --->primitive
		String s1="1000";
		String s2="87.89";
		String s3="P";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
