package com.Collections;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * LinkedList is class implement List interface
 * Under data structure is Doubly linked list
 * Frequent operation is data insertion and deletion
 * It is ordered collection
 * Duplication allowed
 * Non synchronize class
 * 
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		
		if(l.isEmpty())
		{
			l.add(80);
			l.add(20);
			l.add(40);
			l.add(40);
			l.add(22);
			l.add(100);
			
		}
		
		System.out.println("Total Elements are: "+l.size());
		
		System.out.println(l);
		
		
		System.out.println("*****************");
		
		for(Integer i:l)
		{
			System.out.println(i);
		}
		
		System.out.println("*****************");

		ListIterator<Integer>  ir=l.listIterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("*****************");
		while(ir.hasPrevious())
		{
			System.out.println(ir.previous());
		}

		l.addFirst(1000);
		l.addLast(4000);
		
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.get(3));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
