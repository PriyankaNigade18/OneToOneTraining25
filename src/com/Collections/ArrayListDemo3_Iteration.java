package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
* ArrayList is class and implement List Interface
* Underline data structure is Dynamic array
* ArrayList is ordered collection and duplication allowed
* Initial capacity of ArrayList is 10virtual segment
* ArrayList is based on indexing
* Frequent operation is data retrieval
* ArrayList is non synchronize class
* 
* Iteration
* -----------------
* 1.simple for loop
* 2.for each
* 3.iterator()
* 
* List interface
* ================
* listIterator()
* 
* 
* 
*/
public class ArrayListDemo3_Iteration {

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);

		System.out.println("******Iteration using for loop************");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("******Iteration using foreach loop************");

			for(Integer i:al)
			{
				System.out.println(i);
			}
		
	System.out.println("******Iteration usin iterator()************");
	/*
	 * iterator() returns Object of Iterator interface.
	 * 
	 * Iterator interface has two method
	 * ---------------------
	 * 1.hasNext()
	 * 2.next()
	 * 
	 */
	
	Iterator<Integer> ir=al.iterator();
	
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
	System.out.println("***************ListIterator****************");
	
	ListIterator<Integer> ls=al.listIterator();
	while(ls.hasNext())
	{
		System.out.println(ls.next());
	}
		
	System.out.println("****************");
	while(ls.hasPrevious())
	{
		System.out.println(ls.previous());
	}
		

	}

}
