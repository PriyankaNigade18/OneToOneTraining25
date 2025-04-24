package com.OOP.DataAbstraction;

/*
 * Data abstraction is way to hide internal mechanism of software
 * and provide relevant features to the user
 * 
 * In Java we are able to achieve abstraction using 
 * 1.Abstract Class
 * ---------------------
 * A class which declare with abstract keyword is called Abstract class
 * This class can have both implemented method and Non implemented(abstract method)
 *  
 * Method with body- fully implemented method
 * Method without body is called abstract method so this method you need to design using
 * abstract keyword
 * 
 * For abstract class Object creation is not possible
 * 
 * Using this class only partial abstraction is possible
 * 
 * Note: To implement that abstract method we need Child class
 * 
 * 
 * 
 */
public abstract class AbstractClass {

	//fully implemented method
	public void accept()
	{
		System.out.println("Accept()...calling from Abstract class");
	}
	
	
	//abstract method
	public abstract void show();
	
	public static void main(String args[])
	{
		//Cannot instantiate the type AbstractClass
		//AbstractClass a1=new AbstractClass();
		
		
	}
	
	
	
	
	
	
	
	
}
