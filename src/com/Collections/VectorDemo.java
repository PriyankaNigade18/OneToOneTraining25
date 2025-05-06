package com.Collections;

import java.util.Vector;

/*
 * Vector is class implement List interface
 * Underline data structure is Dynamic array
 * vector is thread safe(at a time only one thread)/synchronize class
 * Performance wise it is slow
 * 
 */
public class VectorDemo {

	public static void main(String[] args)
	{

			Vector<Integer> v1=new Vector<Integer>();
			v1.add(100);
			v1.add(20);
			v1.add(90);
			v1.add(300);
			v1.add(20);
			
			System.out.println(v1);
			System.out.println("Total elements: "+v1.size());
			

	}

}
