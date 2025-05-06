package com.Collections;

import java.util.ArrayList;

public class ArrayListDemo4_Scenarios {

	public static void main(String[] args)
	{

		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);
		
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(40);
		l2.add(50);
		
		System.out.println(l2);
		/*
		 * addAll()
		 */
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.addAll(l1);
		list.addAll(l2);
		
		
		System.out.println(list);
		
		//Using constructor
		ArrayList<Integer> l3=new ArrayList<Integer>(list);
		l3.add(100);
		l3.add(200);
		
		System.out.println(l3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
