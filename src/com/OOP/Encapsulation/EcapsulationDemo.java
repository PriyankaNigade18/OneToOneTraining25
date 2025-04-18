package com.OOP.Encapsulation;


/*
 * Definition: Wrapping of data and function together in single unit
 * Purpose is: Data hiding/security
 * Real time Example: Capsule,Mobile devivce
 * How to implement in Java
 * -----------------------
 * 1.declare variable as private
 * 2.create public method to provide access of data
 * 		getter() and setter()
 * 
 * 
 */

class Employee
{
	
	private int empId=101;
	private String name="Sarang";
	private int salary=87776665;
	
	//public method: setter and getter method those are specific to data

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//Business logic
	public void show()
	{
		System.out.println("Employee id is: "+empId);
		System.out.println("Employee Name is: "+name);
		System.out.println("Employee Salary is: "+salary);
	
	}

}

public class EcapsulationDemo
{

	public static void main(String[] args) 
	{

		Employee e1=new Employee();
		e1.show();
		//e1.salary=999999999;
		
		e1.setSalary(99999999);
		
		//e1.show();
		
		System.out.println(e1.getSalary());


	}

}
