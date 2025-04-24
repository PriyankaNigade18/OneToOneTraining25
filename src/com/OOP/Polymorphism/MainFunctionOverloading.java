package com.OOP.Polymorphism;

public class MainFunctionOverloading
{
	
	
	public static void main(int[] args)//arr[10,20,30]
	{
		System.out.println("Main function with int arguments");
		for(int i:args)
		{
			System.out.println(i);
		}

	}

	public static void main(String[] args)
	{
		System.out.println("Main function with String arguments");

		int arr[]= {10,20,30};
		main(arr);
	}
	
	

}
