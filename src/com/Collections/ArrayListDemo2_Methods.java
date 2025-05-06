package com.Collections;

import java.util.ArrayList;

/*
 * ArrayList is class and implement List Interface
 * Underline data structure is Dynamic array
 * ArrayList is ordered collection and duplication allowed
 * Initial capacity of ArrayList is 10virtual segment
 * ArrayList is based on indexing
 * Frequent operation is data retrieval
 * ArrayList is non synchronize class
 * 
 */
public class ArrayListDemo2_Methods {

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Is arraylist is empty?: "+al.isEmpty());//true
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		
		System.out.println("Is arraylist is empty?: "+al.isEmpty());//false
		System.out.println(al);
		
		System.out.println("Total elements from array?: "+al.size());//4
		
		//insert data any any certain position add(index ,data)
		
		al.add(0,100);
		
		al.add(1,null);//2
		
		al.add(1,null);//1
		System.out.println(al);
		System.out.println(al.size());//7
		//search-contains()
		System.out.println("look for 50?: "+al.contains(50));//false
		System.out.println("look for 100?: "+al.contains(100));//true
		
		//remove as index
		al.remove(1);
		System.out.println(al);
		
		//indexOf()
		System.out.println(al.indexOf(30));//4
		
		al.add(6,30);
		
		System.out.println(al);
		
		//last index for 30
		System.out.println(al.lastIndexOf(30));//6
		
		//sublist
		//3-1=2
		
		System.out.println(al.subList(1,3));
		System.out.println(al.subList(1,4));//1,2,3
		
		
		//toArray()
		Object arr[]=al.toArray();
		for(Object i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println(arr[2]);
		
		//System.out.println(al.get(9));//IndexOutOfBoundsException
		
		//clear 
		al.clear();
		
		System.out.println(al);//[]
		System.out.println(al.size());//0
		
		
		

		
		

	}

}
