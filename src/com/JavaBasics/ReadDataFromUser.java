package com.JavaBasics;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadDataFromUser {

	public static void main(String[] args) throws IOException
	{
		
		/*
		 * Scanner  class
		 * --------------------
		 * int = nextInt()
		 * boolean = nextBoolen()
		 * String = nextLine()
		 * 
		 */
		
		
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Hello "+name);
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		System.out.println("your age is: "+age);
		
		//sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 *  System.in.read()
		 *  It reads only one character and return int data(Ascii)
		 

		
		System.out.println("Enter your age");
		int age=System.in.read();
		System.out.println("Hello your age is: "+(char)age);
		
		
		
		//BufferedReader
		System.out.println("Enter your age");
		
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String data=br.readLine();
		//String to int
		int age=Integer.parseInt(data);
		System.out.println("Hello your age is: "+age);
		*/
		
		
		
		
		
		
		
		
		
	}

}
