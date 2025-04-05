package com.JavaBasics;

public class TypeCastingWays {

	public static void main(String[] args)
	{
		/*
		 * primitive to primitive
		 * -------------------------
		 * 1.Implicit: small size--->large size
		 * 
		 * 2.Explicit: large size--->small
		 */
		
		
		int x=1865765765;//4byte
		long l1=x;//8byte
		System.out.println("int to long: "+l1);
		
		
		char c1='A';//2byte
		int y=c1;//4byte
		
		System.out.println("char to int conversion: "+y);
		
		int u=8976;//4byte
		float f1=u;//4byte
		
		System.out.println("int to float conversion: "+f1);
		
		//Explicit
				
		long l2=99877766555444333L;
		int g=(int)l2;
		System.out.println("long to int conversion: "+g);
		
		double d1=98766.654333;
		int i=(int) d1;
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
