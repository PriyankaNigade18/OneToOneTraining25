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
		System.out.println(s1+1000);//10001000
		int num=Integer.parseInt(s1);
		System.out.println(num+1000);//2000
			
		
		String s2="87.89";
		System.out.println(s2+11.11);//87.8911.11
		//string to double
		double num2=Double.parseDouble(s2);
		System.out.println(num2+11.11);
		
		
		/*
		 * String to char
		 * String is collection of character
		 * from string if you want any character then use method charAt(index)
		 */
		String s3="P";
		char ch=s3.charAt(0);
		System.out.println("String to char: "+ch);
		
		
		//primitive to String
		
		
		int b=190;
		System.out.println(b+100);//290
		String bnum=String.valueOf(b);
		System.out.println(bnum+100);//190100
		
		/*
		 * check the bill and confirm amount is less than 10000
		 */
		String bill="Total amount is 5000";
		
		//seperate out 5000 from string
		String data=bill.split(" ")[3];
		
		//String to int conversion
		int amount=Integer.parseInt(data);
		
		//campare control flow statement
		
		if(amount<10000)
		{
			System.out.println("Test case pass!");
		}else
		{
			System.out.println("Test Case Fail ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
