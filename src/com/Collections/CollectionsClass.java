package com.Collections;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsClass {

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
		System.out.println(l);
		
		
		//sort
		Collections.sort(l);
		
		System.out.println(l);
		
		System.out.println("max number: "+Collections.max(l));//100
		System.out.println("Min number: " +Collections.min(l));//20
		

		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		
		System.out.println(l2);
		
		Collections.copy(l2,l);
		
		System.out.println(l2);
		
		
		
		
		
		
		
		
		
	}

}
