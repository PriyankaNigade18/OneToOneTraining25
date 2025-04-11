package com.Array_String;

public class SingleDArrayOpertaion 
{
	public void add(int a[],int b[])
	{
		int result[]=new int[3];
		
		for(int i=0;i<a.length;i++)
		{
			result[i]=a[i]+b[i];
		}

		System.out.println("Addition is:");

		for(int r:result)
		{
			System.out.println(r);
		}
	}

	public static void main(String[] args)
	{

		int a[]= {10,20,30};
		int b[]= {10,20,30};
		
		SingleDArrayOpertaion s1=new SingleDArrayOpertaion();
		s1.add(a,b);
		/*
		int result[]=new int[3];
		
		for(int i=0;i<a.length;i++)
		{
			result[i]=a[i]+b[i];
		}

		System.out.println("Addition is:");

		for(int r:result)
		{
			System.out.println(r);
		}
		
		*/
	}

}
