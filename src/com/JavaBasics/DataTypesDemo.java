package com.JavaBasics;

public class DataTypesDemo {

	public static void main(String[] args)
	{
		//Boolean true/false 1bit
		boolean status=true;
		System.out.println("Boolean data is: "+status);
		status=false;
		System.out.println("Updated value is: "+status);
		
		boolean newStatus=true;
		System.out.println("New status is: "+newStatus);
		
		System.out.println("***********************");
		//Numeric--->character   Integral
		
		/*
		 * char 2byte 
		 * ---------------
		 * 1.single character
		 * 2.special character
		 * 3.ASCII values for character
		 * 
		 * A-Z= 65 to 90
		 * a-z= 97 to 122
		 * 0-9= 48 to 57
		 * 
		 */
		
		
		char c1='A';
		System.out.println("character is: "+c1);//A
		
		char c2='#';
		System.out.println("Special character is: "+c2);//#
		
		char c3=90;
		System.out.println("Character for ASCII 90: "+c3);//Z
		
		
		System.out.println("*********************************");

		//Numeric--.Integral--->Integer    Floating point
		/*
		 * byte -->short--->int(default type)--->long
		 * 
		 * float--->double(default type)
		 */
		
		//byte 1byte -128 to 127
		
		byte b1=127;
		byte b2=-128;
		byte b3=101;
		//byte b4=-130;//Type mismatch: cannot convert from int to byte
		
		//byte b4=150;
		
		System.out.println("byte data is: "+b1);
		System.out.println("byte data is: "+b2);
		System.out.println("byte data is: "+b3);
		
		//short 2byte -32768 to 32767
		short s1=32000;
		//short s2=34000;//Type mismatch: cannot convert from int to short
		System.out.println("short data is: "+s1);
		//int 4byte 
		
		int i1=7890000;
		//int i2=9999999999;//The literal 9999999999 of type int is out of range 
		
		System.out.println("integer data is: "+i1);
		//long 8byte
		
		long l1=9999999999L;
		System.out.println("long data is: "+l1);
		
		
		//floating point
		/*
		 * 1.float 4byte: 32bit
		 * 2.double 8byte: 64bit
		 * 
		 */
		
		
		float f1=56.454433F;
		System.out.println("Float value is: "+f1);
		
		double d1=90.77665544456789;
		System.out.println("double data is: "+d1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
