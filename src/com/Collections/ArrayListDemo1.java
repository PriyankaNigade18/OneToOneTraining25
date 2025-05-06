package com.Collections;

import java.util.ArrayList;

/*
 * ArrayList is class and implement List Interface
 * Underline data structure is Dynamic array
 * ArrayList is ordered collection and duplication allowed
 * Initial capacity of ArrayList is 10virtual segment
 * 
 */
public class ArrayListDemo1 {

	public static void main(String[] args) 
	{
		//declaration
		/*
		 * NonGeneric: Not type safe & type casting is needs while reading data  
		 * 
		 * Generic:Type safe & type casting is not required
		 * 
		 * 
		 */
		//array
		int a[]= {10,20,30,40};
		System.out.println(a[2]);//30
		
		
		//non generic
		/*
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add("Jay");
		a1.add(90.78);
		a1.add('s');
		
		System.out.println(a1);
		int num=(int) a1.get(0);
		System.out.println(num);
		
		// ArrayList is a raw type. References to generic type ArrayList<E> should be 
		 //parameterized
		
		*/
		
		
		
		
		
		//Generic: type safe Object-Wrapper class
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1000);
		al.add(200);
		al.add(100);
		al.add(87);
		
		System.out.println(al);
		int num=al.get(0);
		System.out.println(num);//1000
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
