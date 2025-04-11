package com.Array_String;

public class SingleDArray {

	/*
	 * Array is group of similar type of data and object
	 * Array in java implemented as Object only
	 * Array stores element in continuous memory location
	 * Array always stores element as over index position
	 * Array index starts with 0
	 * 
	 * Types
	 * ===========
	 * 1.Single dimensional array(1D)
	 * 2.Multi dimensional array(2D)
	 * 
	 * Ways
	 * ============
	 * 1.Using new keyword
	 * 2.Using literal(constant value)
	 * 
	 */
	public static void main(String[] args)
	{

		//using new keyword way
		int sid[]=new int[5];
		sid[0]=101;
		sid[1]=102;
		sid[3]=104;
		sid[4]=105;
		
		System.out.println("Length of array: "+sid.length);//5
		
		System.out.println(sid[3]);//104
		
		System.out.println(sid[2]);//0
		
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
		
		//print all elements of array
		
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		System.out.println("********For each loop********");

		for(int i:sid)
		{
			System.out.println(i);
		}
		
		System.out.println("****************************");
		
		String loc[]=new String[3];
		loc[0]="Pune";
		loc[1]="Mumbai";
		loc[2]="Delhi";
		
		System.out.println(loc[0]);//Pune
		System.out.println("Total locations are: "+loc.length);
		
		for(int i=0;i<loc.length;i++)
		{
			System.out.println(loc[i]);
		}
		System.out.println("********For each loop********");

		for(String i:loc)
		{
			System.out.println(i);
		}
		System.out.println("****************************");

		//literal Way(constant)
		
		double marks[]= {89.11,34.66,22.99,67.78};
		System.out.println("Total students marks are: "+marks.length);//4
		
		System.out.println(marks[3]);//67.78
		
		System.out.println(marks[0]+marks[2]);
		
		System.out.println("Student marks are: "+marks[3]);
		System.out.println("********For each loop********");

		for(double i:marks)
		{
			System.out.println(i);
		}
		
		
		//System.out.println(marks[4]);
		
		System.out.println("************************");
		
		Object empdata[]= {"sarang","Pune",'M',40,98877665555L};
		
		for(int i=0;i<empdata.length;i++)
		{
			System.out.println(empdata[i]);
		}
		
		System.out.println("********For each loop********");
		
		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
